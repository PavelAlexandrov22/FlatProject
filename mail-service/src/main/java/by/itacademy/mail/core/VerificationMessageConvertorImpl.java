package by.itacademy.mail.core;

import by.itacademy.mail.controller.dto.MessageDto;
import by.itacademy.mail.controller.dto.VerificationDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class VerificationMessageConvertorImpl implements VerificationMessageConvertor{
    @Override
    public MessageDto convertVerificationDtoToMessageDto(VerificationDto verificationDto) {
        return new MessageDto(verificationDto.getMail(),"", LocalDateTime.now(), verificationDto.getCode());
    }

    @Override
    public VerificationDto convertMessageDtoToVerificationDto(MessageDto messageDto) {
        return new VerificationDto(messageDto.getText(), messageDto.getTo());
    }
}
