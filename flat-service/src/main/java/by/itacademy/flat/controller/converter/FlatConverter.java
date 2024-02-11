package by.itacademy.flat.controller.converter;

import by.itacademy.flat.controller.dto.FlatDto;
import by.itacademy.flat.controller.dto.RequestFlatDto;
import by.itacademy.flat.controller.dto.ResponseFlatDto;
import by.itacademy.flat.dao.FlatDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

@Component
public class FlatConverter {
    private final ObjectMapper om;

    public FlatConverter(ObjectMapper om) {
        this.om = om;
    }

    public FlatDto toFlat(RequestFlatDto request) {
        return new FlatDto(getHashMap(request.getPrice()), getHashMap(request.getBedrooms()), getHashMap(request.getArea()), request.getFloors(), request.getPhoto());
    }

    public ResponseFlatDto toResponseFlat(FlatDao flatDao) {
        ResponseFlatDto responseFlatDto = new ResponseFlatDto();
        responseFlatDto.setDescription(flatDao.getDescription());
        responseFlatDto.setArea((int) flatDao.getAreaTotal());
        responseFlatDto.setPrice(flatDao.getUsd840());
        responseFlatDto.setFloor(flatDao.getStorey());
        responseFlatDto.setBedrooms(flatDao.getRooms());
        responseFlatDto.setOriginalUrl(flatDao.getUrl());
        responseFlatDto.setUuid(UUID.fromString(flatDao.getId()));
        responseFlatDto.setDtCreate(ZonedDateTime.of(flatDao.getDt_create(), ZoneId.systemDefault()).toInstant().toEpochMilli());
        responseFlatDto.setDtUpdate(ZonedDateTime.of(flatDao.getDt_update(), ZoneId.systemDefault()).toInstant().toEpochMilli());

        try {
            responseFlatDto.setPhotos(om.readValue(flatDao.getImgs(),List.class));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        responseFlatDto.setOfferType("");
        return responseFlatDto;
    }

    private Map<String, Integer> getHashMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        if (Optional.ofNullable(list).isPresent()) {
            list.forEach(s -> {
                if (s.contains("=")) {
                    map.put(s.split("=")[0], Integer.valueOf(s.split("=")[1]));
                }
            });
        }
        return map;
    }
}
