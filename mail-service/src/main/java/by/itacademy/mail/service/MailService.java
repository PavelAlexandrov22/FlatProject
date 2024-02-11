package by.itacademy.mail.service;

import by.itacademy.mail.controller.dto.VerificationDto;
import by.itacademy.mail.core.VerificationMessageConvertor;
import by.itacademy.mail.service.util.MessageDeliver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {


    private final MessageDeliver messageDeliver;
    private final VerificationMessageConvertor verificationMessageConvertor;

    public MailService(MessageDeliver messageDeliver, VerificationMessageConvertor verificationMessageConvertor) {
        this.messageDeliver = messageDeliver;
        this.verificationMessageConvertor = verificationMessageConvertor;
    }

    public void sendVerificationCodeToUser(VerificationDto verificationDto) {
        messageDeliver.send(verificationMessageConvertor.convertVerificationDtoToMessageDto(verificationDto));

    }
}
