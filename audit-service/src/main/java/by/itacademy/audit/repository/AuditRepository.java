package by.itacademy.audit.repository;

import by.itacademy.audit.dao.AuditDao;
import by.itacademy.audit.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface AuditRepository extends JpaRepository<AuditDao,String>, PagingAndSortingRepository<AuditDao,String> {

    Optional<AuditDao> findByUserDaoIs(UserDao userDao);
}
