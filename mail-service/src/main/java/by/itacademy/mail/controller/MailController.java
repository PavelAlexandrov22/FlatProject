package by.itacademy.mail.controller;

import by.itacademy.mail.controller.dto.VerificationDto;
import by.itacademy.mail.controller.utils.JwtTokenHandler;
import by.itacademy.mail.error.exception.AuthenticationNotVerifier;
import by.itacademy.mail.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/confirm")
@Slf4j

public class MailController {

    private final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping
    public void sendMail(@RequestBody VerificationDto verificationDto) throws AuthenticationNotVerifier {
            log.info("mail info2");
            mailService.sendVerificationCodeToUser(verificationDto);
    }
}
