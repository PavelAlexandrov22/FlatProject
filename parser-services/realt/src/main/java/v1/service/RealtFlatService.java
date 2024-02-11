package v1.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v1.domain.Flat;
import v1.domain.flatDao.FlatDao;
import v1.domain.realtApiDTO.Rate;
import v1.repository.RealtRepo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class RealtFlatService {
    private final RealtRepo realtRepo;
    private final ObjectMapper objectMapper;

    public RealtFlatService(RealtRepo realtRepo
            , ObjectMapper objectMapper
    ) {
        this.realtRepo = realtRepo;
        this.objectMapper=objectMapper;
    }

    @Transactional
    public FlatDao saveOrUpdate(Flat flat, String url) {
        List<Rate> rateList = flat.getNormalizedPriceHistory();
        Rate rate = rateList.get(0);
        Integer usd840 = null;
        Integer rub933 = null;
        if (Optional.ofNullable(rate.getPriceRates()).isPresent()) {
            usd840 = Math.toIntExact(Optional.ofNullable(rate.getPriceRates().get("840")).orElse(0L));
            rub933 = Math.toIntExact(Optional.ofNullable(rate.getPriceRates().get("933")).orElse(0L));
        }

        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        Optional<FlatDao> optionalFlat = realtRepo.findByUrl(url);
        FlatDao flatDao = null;
        try {
            if (optionalFlat.isPresent()) {
                flatDao = optionalFlat.get();
                flatDao.setDt_update(LocalDateTime.now());
                flatDao.setCategory(flat.getCategory());
                flatDao.setUsd840(Optional.ofNullable(usd840).orElse(0));
                flatDao.setRub933(Optional.ofNullable(rub933).orElse(0));
                flatDao.setPaymentStatus(flat.getPaymentStatus());
                flatDao.setRaiseDate(flat.getRaiseDate());
                flatDao.setUpdatedAt(flat.getUpdatedAt());
                flatDao.setSeller(flat.getSeller());
                flatDao.setDescription(flat.getDescription());
                flatDao.setAreaTotal(flat.getAreaTotal());
                flatDao.setRooms(flat.getRooms());
                flatDao.setStorey(flat.getStorey());
                flatDao.setImgs(objectMapper.writeValueAsString(flat.getSlides()));
            } else {

                flatDao = new FlatDao(
                        flat.getCategory(),
                        Optional.ofNullable(usd840).orElse(0),
                        Optional.ofNullable(rub933).orElse(0),
                        flat.getPaymentStatus(),
                        flat.getRaiseDate(),
                        flat.getCreatedAt(),
                        flat.getUpdatedAt(),
                        flat.getSeller(),
                        flat.getStateRegionName(),
                        flat.getStateDistrictName(),
                        flat.getTownName(),
                        flat.getTownDistrictName(),
                        flat.getTownSubDistrictName(),
                        flat.getStreetName(),
                        Optional.ofNullable(flat.getHouseNumber()).orElse(0),
                        flat.getDescription(),
                        flat.getAreaTotal(),
                        flat.getRooms(),
                        flat.getStorey(),
                        objectMapper.writeValueAsString(flat.getSlides()),
                        nowLocalDateTime,
                        nowLocalDateTime,
                        url);
                realtRepo.save(flatDao);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return flatDao;
    }

}
