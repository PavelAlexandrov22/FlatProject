package by.itacademy.user.service;

import by.itacademy.user.controller.aspect.LoggingRest;
import by.itacademy.user.controller.dto.UserDto;
import by.itacademy.user.controller.dto.audit.Type;
import by.itacademy.user.core.convertors.UserConvertor;
import by.itacademy.user.dao.*;
import by.itacademy.user.error.exception.IllegalRoleException;
import by.itacademy.user.error.exception.IllegalStatusException;
import by.itacademy.user.error.exception.IllegalUserUUIDException;
import by.itacademy.user.error.exception.LoginValidateException;
import by.itacademy.user.controller.feign.FeinClient;
import by.itacademy.user.repository.RoleRepository;
import by.itacademy.user.repository.StatusRepository;
import by.itacademy.user.repository.UserRepository;
import by.itacademy.user.repository.VerificationCodeRepository;
import by.itacademy.user.service.verificationCodeDelivery.DeliveryCodeService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final StatusRepository statusRepository;
    private final DeliveryCodeService deliveryCodeService;
    private final UserConvertor userConvertor;
    private final VerificationCodeRepository verificationCodeRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository, StatusRepository statusRepository, DeliveryCodeService deliveryCodeService
            , UserConvertor userConvertor,
                       VerificationCodeRepository verificationCodeRepository, FeinClient feinClient) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.statusRepository = statusRepository;
        this.deliveryCodeService = deliveryCodeService;
        this.userConvertor = userConvertor;
        this.verificationCodeRepository = verificationCodeRepository;
    }

    @Transactional
    @LoggingRest(type = Type.USER)
    public UserDto registration(UserDto userDto) throws IllegalStatusException, IllegalRoleException {
        User user = getUserWithValidateDto(userDto);
        user = userRepository.saveAndFlush(user);
        String code = deliveryCodeService.getCode();
        deliveryCodeService.deliverCode(user, code);
        verificationCodeRepository.saveAndFlush(new VerificationCodeDAO(user, code, LocalDateTime.now()));
        return userConvertor.toUserDto(user);
    }

    @Transactional
    @LoggingRest(type = Type.USER)
    public UserDto createByAdmin(UserDto userDto) throws IllegalRoleException, IllegalStatusException {
        User user = getUserWithValidateDto(userDto);
        String code = deliveryCodeService.getCode();
        userRepository.saveAndFlush(user);
        if (user.getStatusDao().getStatus().equals(Status.WAITING_ACTIVATION)) {
            verificationCodeRepository.saveAndFlush(new VerificationCodeDAO(user, code, LocalDateTime.now()));
            deliveryCodeService.deliverCode(user, code);
        }
        return userConvertor.toUserDto(user);
    }

    @Transactional(readOnly = true)
    public Page<UserDto> getUsersDtoPage(Pageable pageable) {
        Page<User> usersPage = userRepository.findAll(pageable);
        return usersPage.map(userConvertor::toUserDto);
    }

    @Transactional(readOnly = true)
    public boolean validateUserDtoFields(UserDto userDto, Boolean isIgnoreMailAddress) throws LoginValidateException {
        if (!isIgnoreMailAddress) {
            if (userRepository.findByMailEquals(userDto.getMail()).isPresent()) {
                throw new LoginValidateException("Email is exist");
            }
        }

        if (userDto.getFio() == null || userDto.getFio().isEmpty() || userDto.getFio().length() > 120) {
            return false;
        }

        if (userDto.getRole() != null && !userDto.getRole().isEmpty()) {
            switch (Role.valueOf(userDto.getRole().toUpperCase())) {
                case ADMIN, USER, MANAGER -> {
                }
                default -> {
                    return false;
                }
            }
        } else {
            return false;
        }

        if (userDto.getStatus() != null || !userDto.getStatus().isEmpty()) {
            switch (Status.valueOf(userDto.getStatus().toUpperCase())) {
                case ACTIVATED, WAITING_ACTIVATION, DEACTIVATED -> {
                }
                default -> {
                    return false;
                }
            }
        } else {
            return false;
        }
        if (userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
            return false;
        }
        return true;
    }

    @Transactional(readOnly = true)
    public UserDto getUserDtoUsedUUID(String uuid) throws IllegalUserUUIDException {
        if (uuid != null) {
            if (uuid.length() == 36) {
                Optional<User> userOpt = userRepository.findUserByUUID(UUID.fromString(uuid));
                if (userOpt.isPresent()) {
                    return userConvertor.toUserDto(userOpt.get());
                } else {
                    throw new IllegalUserUUIDException("No such user!");
                }
            } else {
                throw new IllegalUserUUIDException("Illegal uuid length");
            }
        } else {
            throw new IllegalUserUUIDException("Illegal uuid");
        }

    }

    @Transactional
    @LoggingRest(type = Type.USER)
    public UserDto updateUserByUUID(UserDto userDto, UserDto updatebleUserDto, LocalDateTime dtUpdate) {

        userRepository.findUserByUUID(UUID.fromString(updatebleUserDto.getUuid()))
                .ifPresent(user -> {
                    user.setPassword(updatebleUserDto.getPassword());
                    if (userDto.getRole() != null) {
                        roleRepository.findByRoleIs(Role.valueOf(userDto.getRole().toUpperCase())).ifPresent(user::setRoleDao);
                    }
                    if (userDto.getStatus() != null) {
                        statusRepository.findByStatusIs(Status.valueOf(userDto.getStatus().toUpperCase())).ifPresent(user::setStatusDao);
                    }
                    user.setFio(user.getFio());
                    user.setDt_update(dtUpdate);
                });
        return userConvertor.toUserDto(userRepository.findUserByUUID(UUID.fromString(updatebleUserDto.getUuid())).get());

    }

    @Transactional(readOnly = true)
    public String getValidateCodeOfUser(String mail) {
        String code = null;
        Optional<VerificationCodeDAO> optionalVerificationCodeDAO = verificationCodeRepository.findByUser(userRepository.findByMailIs(mail).get());
        if (optionalVerificationCodeDAO.isPresent()) {
            Optional<String> optionalCode = Optional.ofNullable(optionalVerificationCodeDAO.get().getCode());
            if (optionalCode.isPresent()) {
                code = optionalCode.get();
            }
        }
        return code;
    }

    @Transactional(readOnly = true)
    public boolean isMailExist(String mail) {
        return userRepository.findByMailIs(mail).isPresent();
    }

    @Transactional
    @LoggingRest(type = Type.USER)
    public UserDto getVerificaton(String mail) throws LoginValidateException {
        Optional<User> optionalUser = userRepository.findByMailIs(mail);
        if (optionalUser.isPresent()) {
            Optional<StatusDao> optionalStatus = statusRepository.findByStatusIs(Status.ACTIVATED);
            User user = optionalUser.get();
            optionalStatus.ifPresent(user::setStatusDao);
            return userConvertor.toUserDto(userRepository.saveAndFlush(user));
        } else {
            throw new LoginValidateException("No such user");
        }
    }

    @Transactional(readOnly = true)
    public UserDto getUserDto(String selfName) throws LoginValidateException {
        Optional<User> optionalUser = userRepository.findByMailIs(selfName);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return userConvertor.toUserDto(user);
        } else {
            throw new LoginValidateException("not exist");
        }
    }

    @Transactional(readOnly = true)
    public User getUserWithValidateDto(UserDto userDto) throws IllegalRoleException, IllegalStatusException {
        User user = userConvertor.toUser(userDto);
        Optional<RoleDao> optionalRoleDao = roleRepository.findByRoleIs(user.getRoleDao().getRole());
        Optional<StatusDao> optionalStatusDao = statusRepository.findByStatusIs(user.getStatusDao().getStatus());
        if (optionalStatusDao.isPresent()) {
            user.setStatusDao(optionalStatusDao.get());
        } else {
            throw new IllegalStatusException("no such status");
        }
        if (optionalRoleDao.isPresent()) {
            user.setRoleDao(optionalRoleDao.get());
        } else {
            throw new IllegalRoleException("no such role");
        }
        return user;
    }
}
