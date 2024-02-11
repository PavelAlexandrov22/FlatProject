package by.itacademy.mail;

import by.itacademy.mail.configuration.properties.JWTProperty;
import by.itacademy.mail.configuration.properties.AppMailProperties;
import by.itacademy.mail.configuration.properties.UrlProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({UrlProperties.class, AppMailProperties.class, JWTProperty.class})
public class MailApplication {
    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }
}
