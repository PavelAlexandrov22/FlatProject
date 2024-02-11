package v1.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import v1.config.schedulerProperties.ParserProperties;
import v1.controller.RealtController;
import v1.domain.Flat;
import v1.domain.flatDao.FlatDao;
import v1.domain.realtApiDTO.RealtObject;
import v1.service.RealtFlatService;
import v1.service.RealtObjectService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Component
public class ScheduledComponent {
    private final ObjectMapper om;
    private final String firstEndpoint;
    private final Logger logger = LoggerFactory.getLogger(RealtController.class);
    private final RealtObjectService realtObjectService;
    private final RealtFlatService realtFlatService;

    private final ParserProperties parserProperties;

    public ScheduledComponent(RealtObjectService realtObjectService, RealtFlatService realtFlatService, ParserProperties parserProperties) {
        this.parserProperties = parserProperties;
        this.firstEndpoint = parserProperties.getParserConfig().getExternalURL();
        this.om=parserProperties.getMapper();
        this.realtObjectService = realtObjectService;
        this.realtFlatService = realtFlatService;
    }

    @Scheduled(cron = "0 00 8,20 * * *")
    @Async
    public void start() {
        //todo start in demon
        String responseAllFlats = getResponse(firstEndpoint);
        if (responseAllFlats != null) {
            List<String> urlsOfFlats = realtObjectService.getAllUrlsFromResponse(responseAllFlats);
            urlsOfFlats.forEach(this::getFlat);
        } else {
            logger.warn("First http endpoint: response is empty");
        }
    }

    public void getFlat(String url) {
        om.configure(DeserializationFeature
                        .FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        RealtObject realtObject = null;

        logger.info(url);
        String response = getResponse(url);
        if (response != null) {
            String pojo = realtObjectService.getJsonEntity(response);

            if (pojo.contains("objectView")) {
                try {
                    realtObject = om.readValue(pojo, RealtObject.class);
                } catch (JsonProcessingException e) {
                    logger.error(e.getMessage());
                }
            }

            if (realtObject != null) {
                Flat flat = realtObject.getProps().getPageProps().getInitialState().getObjectView().getObject();
                FlatDao f=realtFlatService.saveOrUpdate(flat, url);
//                try {
//                    Files.write(Paths.get("backup.txt"), (om.writeValueAsString(f) + "\r\n").getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
//                } catch (IOException e) {
//                    logger.error(e.getMessage());
//                }
            }

            try {
                Thread.sleep((long) (Math.random() * 1000 * parserProperties.getParserConfig().getTimeout()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            logger.warn("endpoint: response is empty");
        }
    }

    public String getResponse(String url) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader(HttpHeaders.USER_AGENT,parserProperties.getParserConfig().getUserAgent());
            return EntityUtils.toString(httpClient.execute(httpGet).getEntity());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return null;
    }
}
