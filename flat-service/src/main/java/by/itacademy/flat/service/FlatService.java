package by.itacademy.flat.service;

import by.itacademy.flat.controller.converter.FlatConverter;
import by.itacademy.flat.controller.dto.FlatDto;
import by.itacademy.flat.controller.dto.RequestFlatDto;
import by.itacademy.flat.controller.dto.ResponseFlatDto;
import by.itacademy.flat.dao.FlatDao;
import by.itacademy.flat.error.exception.IllegalValueException;
import by.itacademy.flat.repository.FlatRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FlatService {

    private final FlatRepository flatRepository;
    private final FlatConverter flatConverter;

    public FlatService(FlatRepository flatRepository, FlatConverter flatConverter) {
        this.flatRepository = flatRepository;
        this.flatConverter = flatConverter;
    }

    @Transactional(readOnly = true)
    public Page<ResponseFlatDto> getFlatsPage(RequestFlatDto request, Pageable pageable) throws IllegalValueException {
        FlatDto flatDto = flatConverter.toFlat(request);

        int priceFrom = Optional.ofNullable(flatDto.getPrice().get("from")).orElse(0);
        int priceTo = Optional.ofNullable(flatDto.getPrice().get("to")).orElse(Integer.MAX_VALUE);

        if (priceFrom < 0 || priceTo < 1 || priceTo <= priceFrom) {
            throw new IllegalValueException("illegal value price");
        }

        int bedroomFrom = Optional.ofNullable(flatDto.getBedrooms().get("from")).orElse(0);
        int bedroomTo = Optional.ofNullable(flatDto.getBedrooms().get("to")).orElse(Integer.MAX_VALUE);

        if (bedroomFrom < 0 || bedroomTo < 1 || bedroomTo <= bedroomFrom) {
            throw new IllegalValueException("illegal value bedroom");
        }
        int areaFrom = Optional.ofNullable(flatDto.getArea().get("from")).orElse(0);
        int areaTo = Optional.ofNullable(flatDto.getArea().get("to")).orElse(Integer.MAX_VALUE);

        if (areaFrom < 0 || areaTo < 1 || areaTo <= areaFrom) {
            throw new IllegalValueException("illegal value area");
        }

        Page<FlatDao> flatDaos;
        if (Optional.ofNullable(flatDto.getFloors()).isEmpty()) {
            if (Optional.ofNullable(request.getPhoto()).orElse(false)) {
                flatDaos= flatRepository.findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndImgsIsNotNull(priceFrom, priceTo, bedroomFrom, bedroomTo, areaFrom, areaTo, pageable);
            } else {
                flatDaos=flatRepository.findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndImgsIsNotNull(priceFrom, priceTo, bedroomFrom, bedroomTo, areaFrom, areaTo, pageable);
            }
        } else {
            if (Optional.ofNullable(request.getPhoto()).orElse(false)) {
                flatDaos= flatRepository.findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndStoreyInAndImgsIsNotNull(priceFrom, priceTo, bedroomFrom, bedroomTo, areaFrom, areaTo,flatDto.getFloors(), pageable);
            } else {
                flatDaos=flatRepository.findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndStoreyInAndImgsIsNotNull(priceFrom, priceTo, bedroomFrom, bedroomTo, areaFrom, areaTo,flatDto.getFloors(), pageable);
            }
        }

        return flatDaos.map(flatConverter::toResponseFlat);
    }
}
