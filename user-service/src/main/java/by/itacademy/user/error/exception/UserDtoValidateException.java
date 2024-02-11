package by.itacademy.user.error.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserDtoValidateException extends Exception{
    public UserDtoValidateException(String message) {
        super(message);
    }

}
