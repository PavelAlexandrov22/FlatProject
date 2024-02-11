package by.itacademy.user.repository;

import by.itacademy.user.dao.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User,String>, PagingAndSortingRepository<User,String> {
    Optional<User> findByMailEquals(String mail);
    Optional<User> findByMailIs(String username);
    Optional<User> findUserByUUID(UUID uuid);



}
