package by.itacademy.audit.service;

import by.itacademy.audit.controller.dto.AuditLogDto;
import by.itacademy.audit.core.AuditConverter;
import by.itacademy.audit.dao.UserDao;
import by.itacademy.audit.error.exception.IllegalUUIDException;
import by.itacademy.audit.repository.AuditRepository;
import by.itacademy.audit.repository.TypeRepository;
import by.itacademy.audit.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AuditUserService {
    private final UserRepository userRepository;
    private final TypeRepository typeRepository;
    private final AuditRepository auditRepository;

    private final AuditConverter auditConverter;

    public AuditUserService(UserRepository userRepository, TypeRepository typeRepository, AuditRepository auditRepository, AuditConverter auditConverter) {
        this.userRepository = userRepository;
        this.typeRepository = typeRepository;
        this.auditRepository = auditRepository;
        this.auditConverter = auditConverter;
    }


    public Page<AuditLogDto> getLog(Pageable pageable){
        return auditRepository.findAll(pageable).map(auditConverter::convert);
    }

    public AuditLogDto getlog(UUID uuid) throws IllegalUUIDException {
        Optional<UserDao> optionalUserDao =userRepository.findUserDaoByUuid(uuid);
        if(optionalUserDao.isPresent()){
            return auditConverter.convert(auditRepository.findByUserDaoIs(optionalUserDao.get()).get());
        }else{
            throw new IllegalUUIDException("argument is illegal");
        }

    }




}
