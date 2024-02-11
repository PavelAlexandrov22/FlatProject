package v1.config.schedulerProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "parser")
public class ParserConfig {

    private String externalURL;
    private int timeout;

    private String userAgent;

    public ParserConfig() {
    }

    public ParserConfig(String externalURL, int timeout, String userAgent) {
        this.externalURL = externalURL;
        this.timeout = timeout;
        this.userAgent = userAgent;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
