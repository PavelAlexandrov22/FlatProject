package by.itacademy.user.error.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IllegalUserUUIDException extends Exception{

    public IllegalUserUUIDException(String message) {
        super(message);
    }
}
