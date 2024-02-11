package v1.service;

import org.springframework.stereotype.Service;
import v1.config.app.AppConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RealtObjectService {

 private final Pattern pattern;
 private final AppConfig appConfig;

    public RealtObjectService(Pattern pattern, AppConfig appConfig) {

        this.pattern = pattern;
        this.appConfig = appConfig;
    }

    public List<String> getAllUrlsFromResponse(String response){
        List<String> urls=new ArrayList<>();

        Matcher matcher=pattern.matcher(response);
        while (matcher.find()){
            String url=matcher.group();
            url=url.substring(appConfig.getBeginPatternString().length(),url.length()- appConfig.getEndPatternString().length());
            urls.add(url.replace("sale-rooms","sale-flats"));
        }
        return urls;
    }

    public String getJsonEntity(String stringResponse){
        return stringResponse.substring(stringResponse.indexOf(appConfig.getStart())+ appConfig.getStart().length(),stringResponse.indexOf(appConfig.getEnd()));
    }


}
