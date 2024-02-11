package by.itacademy.user.controller.feign;

import by.itacademy.user.controller.dto.audit.AuditDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "audit-client", url= "audit-service:8080")
public interface AuditFeignClient {

    @PostMapping("/logging")
    void sendLog(AuditDto auditDto);
}
