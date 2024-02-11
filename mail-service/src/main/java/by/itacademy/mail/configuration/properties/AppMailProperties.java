package by.itacademy.mail.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.mail.properties")
public class AppMailProperties {
    private String subject;
    private String textPrefix;
    private String textPostfix;
    private String sender;

    public AppMailProperties() {
    }
    public AppMailProperties(String subject, String textPrefix, String textPostfix, String sender) {
        this.subject = subject;
        this.textPrefix = textPrefix;
        this.textPostfix = textPostfix;
        this.sender=sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTextPrefix() {
        return textPrefix;
    }

    public void setTextPrefix(String textPrefix) {
        this.textPrefix = textPrefix;
    }

    public String getTextPostfix() {
        return textPostfix;
    }

    public void setTextPostfix(String textPostfix) {
        this.textPostfix = textPostfix;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
