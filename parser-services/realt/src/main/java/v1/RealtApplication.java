package v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import v1.config.app.AppConfig;
import v1.config.schedulerProperties.ParserConfig;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties({AppConfig.class, ParserConfig.class})
public class RealtApplication {
    public static void main(String[] args) {
        SpringApplication.run(RealtApplication.class, args);
    }

}
