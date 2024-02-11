package by.itacademy.user.error.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class WaitingAvtivationException extends Exception{
    public WaitingAvtivationException(String message) {
        super(message);
    }
}
