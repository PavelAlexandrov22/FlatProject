package by.itacademy.mail.service.util;

import by.itacademy.mail.controller.dto.MessageDto;
import org.springframework.boot.autoconfigure.mail.MailProperties;

public interface MessageDeliver {
    void send(MessageDto messageDto);
}
