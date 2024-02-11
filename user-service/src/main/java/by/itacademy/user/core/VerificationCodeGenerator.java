package by.itacademy.user.core;

import by.itacademy.user.controller.dto.VerificationCodeDto;
import org.springframework.stereotype.Component;

import java.util.Random;

import static java.time.LocalDateTime.now;

@Component
public class VerificationCodeGenerator {

    public VerificationCodeDto getVerificationCode(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return new VerificationCodeDto(now(), String.format("%06d", number));
    }
}
