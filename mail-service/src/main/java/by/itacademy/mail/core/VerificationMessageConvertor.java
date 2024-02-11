package by.itacademy.mail.core;

import by.itacademy.mail.controller.dto.MessageDto;
import by.itacademy.mail.controller.dto.VerificationDto;

public interface VerificationMessageConvertor {
    MessageDto convertVerificationDtoToMessageDto(VerificationDto verificationDto);
    VerificationDto convertMessageDtoToVerificationDto(MessageDto messageDto);
}
