package by.itacademy.user.repository;

import by.itacademy.user.dao.Status;
import by.itacademy.user.dao.StatusDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StatusRepository extends JpaRepository<StatusDao, Integer> {
    Optional<StatusDao> findByStatusIs(Status status);
}
