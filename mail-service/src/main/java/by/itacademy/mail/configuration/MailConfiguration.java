package by.itacademy.mail.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
@AutoConfigureAfter(JavaMailSender.class)
public class MailConfiguration {



}
