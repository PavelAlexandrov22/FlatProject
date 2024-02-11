package by.itacademy.user.controller.feign;

import by.itacademy.user.controller.dto.VerificationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "mail-client", url= "mail-service:8080")
public interface FeinClient {
    @PostMapping("/confirm")
    void getInfo(VerificationDto verificationDto);
}
