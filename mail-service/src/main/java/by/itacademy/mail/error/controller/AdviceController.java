package by.itacademy.mail.error.controller;

import by.itacademy.mail.error.dto.ResponseDto;
import by.itacademy.mail.error.exception.AuthenticationNotVerifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class AdviceController {

    @ExceptionHandler(AuthenticationNotVerifier.class)
    public ResponseEntity<ResponseDto> handleUAuthenticationNotVerifier(AuthenticationNotVerifier e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResponseDto> handleIllegalArgumentException(IllegalArgumentException e) {
        ResponseDto response = new ResponseDto("error", String.format("%s : %s", LocalDateTime.now(), "some argument is illegal"));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<ResponseDto> getFormattedMessage(Exception e) {
        ResponseDto response = new ResponseDto("error", String.format("%s : %s", LocalDateTime.now(), e.getMessage()));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }





}
