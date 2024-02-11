package by.itacademy.audit.controller;

import by.itacademy.audit.controller.dto.AuditLogDto;
import by.itacademy.audit.service.AuditLogService;

import jakarta.annotation.security.PermitAll;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
public class LogAuditController {
    private final AuditLogService auditLogService;

    public LogAuditController(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @PermitAll //fixme create role
    @PostMapping
    public void saveAudit(@RequestBody AuditLogDto log) {
        auditLogService.save(log);
    }
}
