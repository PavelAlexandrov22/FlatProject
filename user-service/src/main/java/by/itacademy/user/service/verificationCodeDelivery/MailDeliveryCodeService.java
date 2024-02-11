package by.itacademy.user.service.verificationCodeDelivery;

import by.itacademy.user.controller.dto.VerificationDto;
import by.itacademy.user.core.VerificationCodeGenerator;
import by.itacademy.user.dao.User;
import by.itacademy.user.controller.feign.FeinClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailDeliveryCodeService implements DeliveryCodeService {

    private final VerificationCodeGenerator verificationCodeGenerator;
    private final FeinClient feinClient;


    public MailDeliveryCodeService(VerificationCodeGenerator verificationCodeGenerator, FeinClient feinClient) {
        this.verificationCodeGenerator = verificationCodeGenerator;
        this.feinClient = feinClient;
    }

    @Override
    public void deliverCode(User user, String code) {
        log.info("info mail");
        feinClient.getInfo(new VerificationDto(code, user.getMail()));
    }

    @Override
    public String getCode() {
        return verificationCodeGenerator.getVerificationCode().getCode();
    }


}
