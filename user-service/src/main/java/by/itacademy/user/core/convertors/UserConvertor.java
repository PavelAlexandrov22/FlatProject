package by.itacademy.user.core.convertors;

import by.itacademy.user.controller.dto.UserDto;
import by.itacademy.user.dao.User;

public interface UserConvertor {

    User toUser(UserDto userDto);

    UserDto toUserDto(User user);
}
