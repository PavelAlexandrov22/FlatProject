package v1.config.app;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.properties")
public class AppConfig {
    private String beginPatternString;
    private String endPatternString;
    private String start;
    private String end;

    public AppConfig() {
    }

    public AppConfig(String beginPatternString, String endPatternString, String start, String end) {
        this.beginPatternString = beginPatternString;
        this.endPatternString = endPatternString;
        this.start = start;
        this.end = end;
    }

    public String getBeginPatternString() {
        return beginPatternString;
    }

    public void setBeginPatternString(String beginPatternString) {
        this.beginPatternString = beginPatternString;
    }

    public String getEndPatternString() {
        return endPatternString;
    }

    public void setEndPatternString(String endPatternString) {
        this.endPatternString = endPatternString;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
