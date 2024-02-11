package by.itacademy.user.config;

import by.itacademy.user.core.formatter.LongToLocalDateTimeFormatter;
import by.itacademy.user.core.formatter.Style;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDateTime;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(LocalDateTime.class, new LongToLocalDateTimeFormatter(Style.FULL));
        WebMvcConfigurer.super.addFormatters(registry);
    }
}
