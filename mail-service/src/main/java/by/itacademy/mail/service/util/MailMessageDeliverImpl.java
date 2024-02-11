package by.itacademy.mail.service.util;

import by.itacademy.mail.configuration.properties.AppMailProperties;
import by.itacademy.mail.configuration.properties.UrlProperties;
import by.itacademy.mail.controller.dto.MessageDto;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.Date;

@Component
public class MailMessageDeliverImpl implements MessageDeliver {
    private final JavaMailSender mailSender;
    private final UrlProperties urlProperties;
    private final AppMailProperties appMailProperties;
    private final MailProperties mailProperties;

    public MailMessageDeliverImpl(JavaMailSender mailSender, UrlProperties urlProperties, AppMailProperties appMailProperties, MailProperties mailProperties) {
        this.mailSender = mailSender;
        this.urlProperties = urlProperties;
        this.appMailProperties = appMailProperties;
        this.mailProperties = mailProperties;
    }

    @Override
    public void send(MessageDto messageDto) {
        SimpleMailMessage msg = new SimpleMailMessage();
        StringBuilder stringBuilder = new StringBuilder();
        msg.setFrom(mailProperties.getUsername());
        msg.setTo(messageDto.getTo());
        msg.setSubject(appMailProperties.getSubject() + ":" + messageDto.getSubject());
        msg.setSentDate(Date.from(messageDto.getSendDate().atZone(ZoneId.systemDefault()).toInstant()));
        String text = stringBuilder.append(appMailProperties.getTextPrefix())
                .append(System.getProperty("line.separator"))
                .append(urlProperties.getEndpoint())
                .append("?code=")
                .append(URLEncoder.encode(messageDto.getText(), StandardCharsets.UTF_8))
                .append("&mail=")
                .append(URLEncoder.encode(messageDto.getTo(),StandardCharsets.UTF_8))
                .append(System.getProperty("line.separator"))
                .append(appMailProperties.getTextPostfix()).toString();
        msg.setText(text);
        mailSender.send(msg);
    }
}
