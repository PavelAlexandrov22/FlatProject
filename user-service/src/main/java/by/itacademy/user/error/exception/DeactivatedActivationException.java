package by.itacademy.user.error.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DeactivatedActivationException extends Exception{
    public DeactivatedActivationException(String message) {
        super(message);
    }
}
