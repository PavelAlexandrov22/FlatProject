package by.itacademy.user.controller.aspect;

import by.itacademy.user.controller.dto.UserDto;
import by.itacademy.user.controller.dto.audit.AuditDto;
import by.itacademy.user.controller.dto.audit.AuditUserDto;
import by.itacademy.user.controller.feign.AuditFeignClient;
import by.itacademy.user.error.exception.LoginValidateException;
import by.itacademy.user.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {
    private final AuditFeignClient client;

    public AuditAspect(AuditFeignClient client) {
        this.client = client;
    }

    @Around(value = "@annotation(by.itacademy.user.controller.aspect.LoggingRest)")
    public void auditMethod(ProceedingJoinPoint proceedingJoinPoint) {
        var method = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod();
        String message = null;
        Object proceedObject = null;
        try {
            proceedObject = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            message = e.getMessage();
        }
        if (message == null) {
            UserDto userDto = (UserDto) proceedObject;
            String mail = userDto.getMail();
            AuditUserDto auditUserDto = new AuditUserDto(userDto.getUuid(), mail, userDto.getFio(), userDto.getRole());
            LoggingRest annotation = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod().getAnnotation(LoggingRest.class);
            AuditDto auditDto =new AuditDto(System.currentTimeMillis(), auditUserDto, method.getName(), annotation.type(), ((UserDto) proceedObject).getUuid());
            client.sendLog(auditDto);
        }
    }
}