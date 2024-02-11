package by.itacademy.mail.controller.dto;

import java.time.LocalDateTime;

public class MessageDto {
    private String from;
    private String to;
    private String subject;
    private LocalDateTime sendDate;
    private String text;

    public MessageDto() {
    }

    public MessageDto(String to, String subject, LocalDateTime sendDate, String text) {
        this.to = to;
        this.subject = subject;
        this.sendDate = sendDate;
        this.text = text;
    }

    public MessageDto(String from, String to, String subject, LocalDateTime sendDate, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.sendDate = sendDate;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
