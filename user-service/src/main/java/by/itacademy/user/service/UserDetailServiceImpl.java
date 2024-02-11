package by.itacademy.user.service;

import by.itacademy.user.controller.dto.UserDetailModel;
import by.itacademy.user.dao.User;
import by.itacademy.user.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.findByMailIs(username);
        if (optionalUser.isPresent()) {
            return new UserDetailModel(optionalUser.get());
        } else {
            throw new UsernameNotFoundException("incorrect data");
        }
    }
}
