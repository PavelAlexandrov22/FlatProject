package by.itacademy.user.config;

import by.itacademy.user.dao.Role;
import by.itacademy.user.dao.User;
import by.itacademy.user.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class WebSecurity {

    private final UserRepository userRepository;

    public WebSecurity(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isAdmin(Authentication authentication, String uuid) {
//        if (authentication.isAuthenticated()) {
//            Optional<User> optionalUser = userRepository.findUserByUUID(uuid);
//            if (optionalUser.isPresent()) {
//                if (optionalUser.get().getRoleDao().getRole().equals(Role.ADMIN)) {
//                    return true;
//                }
//            }
//        }
        return false;
    }
}
