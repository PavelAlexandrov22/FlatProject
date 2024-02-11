package by.itacademy.user.repository;

import by.itacademy.user.controller.dto.VerificationDto;
import by.itacademy.user.dao.User;
import by.itacademy.user.dao.VerificationCodeDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VerificationCodeRepository extends JpaRepository<VerificationCodeDAO,Integer> {

    Optional<VerificationCodeDAO> findByUser(User user);
}
