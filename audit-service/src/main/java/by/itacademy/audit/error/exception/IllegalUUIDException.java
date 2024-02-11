package by.itacademy.audit.error.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IllegalUUIDException extends Exception{
    public IllegalUUIDException(String message) {
        super(message);
    }
}
