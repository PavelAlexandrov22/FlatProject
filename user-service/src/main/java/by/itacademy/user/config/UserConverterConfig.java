package by.itacademy.user.config;

import by.itacademy.user.core.convertors.UserConvertor;
import by.itacademy.user.core.convertors.UserConvertorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConverterConfig {

    @Bean
    public UserConvertor userConvertor(PasswordEncoder passwordEncoder){
        return new UserConvertorImpl(passwordEncoder);
    }
}
