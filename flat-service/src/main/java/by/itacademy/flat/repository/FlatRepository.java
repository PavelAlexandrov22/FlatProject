package by.itacademy.flat.repository;

import by.itacademy.flat.dao.FlatDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FlatRepository extends JpaRepository<FlatDao, String>, PagingAndSortingRepository<FlatDao, String> {

    Page<FlatDao> findFlatDaosByUsd840Between(int usd840From, int usd840To, Pageable pageable);

    Page<FlatDao> findFlatDaosByUsd840After(int usd840, Pageable pageable);

    Page<FlatDao> findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndImgsIsEmpty(int usd840From, int usd840To,
                                                                                                    int roomsFrom, int roomsTo,
                                                                                                    int areaTotalFrom, int areaTotalTo, Pageable pageable);

    Page<FlatDao> findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndImgsIsNotNull(int usd840From, int usd840To,
                                                                                                       int roomsFrom, int roomsTo,
                                                                                                       int areaTotalFrom, int areaTotalTo, Pageable pageable);

    Page<FlatDao> findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndStoreyInAndImgsIsNotEmpty(int usd840From, int usd840To,
                                                                                                               int roomsFrom, int roomsTo,
                                                                                                               int areaTotalFrom, int areaTotalTo, List<Integer> storey, Pageable pageable);

    Page<FlatDao> findFlatDaosByUsd840BetweenAndAndRoomsBetweenAndAndAreaTotalBetweenAndStoreyInAndImgsIsNotNull(int priceFrom, int priceTo, int bedroomFrom, int bedroomTo, int areaFrom, int areaTo, List<Integer> floors, Pageable pageable);
}