package by.itacademy.audit.service;

import by.itacademy.audit.controller.dto.AuditLogDto;
import by.itacademy.audit.controller.dto.audit.AuditUserDto;
import by.itacademy.audit.core.AuditConverter;
import by.itacademy.audit.dao.Type;
import by.itacademy.audit.dao.TypeDao;
import by.itacademy.audit.dao.UserDao;
import by.itacademy.audit.repository.AuditRepository;
import by.itacademy.audit.repository.TypeRepository;
import by.itacademy.audit.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
public class AuditLogService {
    private final AuditRepository auditRepository;
    private final UserRepository userRepository;
    private final TypeRepository typeRepository;
    private final AuditConverter auditConverter;

    public AuditLogService(AuditRepository auditRepository, UserRepository userRepository, TypeRepository typeRepository, AuditConverter auditConverter) {
        this.auditRepository = auditRepository;
        this.userRepository = userRepository;
        this.typeRepository = typeRepository;
        this.auditConverter = auditConverter;
    }

    @Transactional
    public void save(AuditLogDto auditLogDto) {
        AuditUserDto auditUserDto=auditLogDto.getAuditUserDto();
        Optional<UserDao> optionalUser=userRepository.findByMailIs(auditUserDto.getMail());
        UserDao userDao;
        if (optionalUser.isPresent()){
            userDao=optionalUser.get();
        }else{
            userDao=userRepository.saveAndFlush(new UserDao(auditUserDto.getUuid(),auditUserDto.getMail(),auditUserDto.getFio(),auditUserDto.getRole()));
        }

        TypeDao typeDao=typeRepository.findByTypeIs(auditLogDto.getType()).orElse(new TypeDao(Type.USER));
        auditRepository.saveAndFlush(auditConverter.convert(auditLogDto,userDao,typeDao));
    }
}
