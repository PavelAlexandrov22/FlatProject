package by.itacademy.flat.error.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IllegalValueException extends Exception{
    public IllegalValueException(String message) {
        super(message);
    }
}
