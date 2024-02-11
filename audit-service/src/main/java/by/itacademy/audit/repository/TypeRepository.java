package by.itacademy.audit.repository;

import by.itacademy.audit.dao.Type;
import by.itacademy.audit.dao.TypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<TypeDao,String>, PagingAndSortingRepository<TypeDao,String> {
    Optional<TypeDao> findByTypeIs(Type type);
}
