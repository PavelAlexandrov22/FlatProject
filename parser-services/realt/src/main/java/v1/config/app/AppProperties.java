package v1.config.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.regex.Pattern;

@Configuration
public class AppProperties {
    private final AppConfig appConfig;

    public AppProperties(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Bean
    public Pattern getPattern() {
        String pattern = Pattern.quote(appConfig.getBeginPatternString()) + ".*" + Pattern.quote(appConfig.getEndPatternString());
        return Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
    }

}
