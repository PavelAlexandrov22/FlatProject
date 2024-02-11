package by.itacademy.audit.controller;

import by.itacademy.audit.controller.dto.AuditLogDto;
import by.itacademy.audit.error.exception.IllegalUUIDException;
import by.itacademy.audit.service.AuditUserService;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/audit")
public class UserAuditController {
    public final AuditUserService auditUserService;

    public UserAuditController(AuditUserService auditUserService) {
        this.auditUserService = auditUserService;
    }


    @RolesAllowed("ADMIN")
    @GetMapping
    public Page<AuditLogDto> getAudit(Pageable pageable) {
        return auditUserService.getLog(pageable);
    }


    @RolesAllowed("ADMIN")
    @GetMapping("/{uuid}")
    public AuditLogDto getAudit(@PathVariable UUID uuid) throws IllegalUUIDException {
        return auditUserService.getlog(uuid);
    }


}
