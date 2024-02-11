package by.itacademy.user.core.convertors;

import by.itacademy.user.controller.dto.UserDto;
import by.itacademy.user.dao.*;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserConvertorImpl implements UserConvertor {
    private final PasswordEncoder encoder;
    public UserConvertorImpl(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    public User toUser(UserDto userDto) {
        return new User(userDto.getMail(),
                userDto.getFio(),
                encoder.encode(userDto.getPassword()),
                userDto.getDtCreate(),
                userDto.getDtUpdate(),
                new RoleDao(Role.valueOf(userDto.getRole().toUpperCase())),
                new StatusDao(Status.valueOf(userDto.getStatus().toUpperCase())));
    }

    public UserDto toUserDto(User user) {
        return new UserDto(user.getPassword(), user.getMail(), user.getFio(), user.getRoleDao().getRole().name(), user.getStatusDao().getStatus().name(), user.getUUID().toString(), user.getDt_create(), user.getDt_update());
    }

}
