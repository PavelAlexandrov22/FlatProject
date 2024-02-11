package v1.config.schedulerProperties;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParserProperties {

    private final ParserConfig parserConfig;

    public ParserProperties(ParserConfig parserConfig) {
        this.parserConfig = parserConfig;
    }

    @Bean
    public ObjectMapper getMapper(){
        return new ObjectMapper();
    }

    public ParserConfig getParserConfig() {
        return parserConfig;
    }
}
