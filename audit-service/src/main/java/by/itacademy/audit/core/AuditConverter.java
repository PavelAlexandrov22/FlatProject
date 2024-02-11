package by.itacademy.audit.core;

import by.itacademy.audit.controller.dto.AuditLogDto;
import by.itacademy.audit.controller.dto.audit.AuditUserDto;
import by.itacademy.audit.dao.AuditDao;
import by.itacademy.audit.dao.TypeDao;
import by.itacademy.audit.dao.UserDao;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.UUID;

@Component
public class AuditConverter {
    public AuditLogDto convert (AuditDao auditDao){

        return new AuditLogDto(getTime(auditDao.getDtCreate()),new AuditUserDto(auditDao.getUserDao().getUuid(),auditDao.getUserDao().getMail(),auditDao.getUserDao().getFio(),auditDao.getUserDao().getRole()), auditDao.getText(), auditDao.getTypeDao().getType(), auditDao.getIdString());
    }

    public AuditDao convert(AuditLogDto auditLogDto, UserDao userDao, TypeDao typeDao){
        return new AuditDao(UUID.randomUUID(),getTime(auditLogDto.getDt_create()),userDao, auditLogDto.getText(),typeDao, auditLogDto.getId());
    }
    public LocalDateTime getTime(long milli){
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(milli),
                TimeZone.getDefault().toZoneId());
    }

    public Long getTime(LocalDateTime localDateTime){
        return localDateTime.atZone(ZoneId.systemDefault()).toEpochSecond();
    }
}
