package by.itacademy.audit.repository;

import by.itacademy.audit.dao.AuditDao;
import by.itacademy.audit.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserDao,String>, PagingAndSortingRepository<UserDao,String> {
    Optional<UserDao> findByMailIs(String mail);

    Optional<UserDao> findUserDaoByUuid(UUID uuid);
}
