package by.itacademy.user.repository;

import by.itacademy.user.dao.Role;
import by.itacademy.user.dao.RoleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleDao,Integer> {
    Optional<RoleDao> findByRoleIs(Role role);

}
