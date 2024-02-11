package by.itacademy.user.error.controller;

import by.itacademy.user.error.exception.*;
import by.itacademy.user.error.dto.ResponseDto;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class AdviceController {
    @ExceptionHandler(IllegalUserUUIDException.class)
    public ResponseEntity<ResponseDto> handleIllegalUserUUIDException(IllegalUserUUIDException e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(LoginValidateException.class)
    public ResponseEntity<ResponseDto> handleLoginValidateException(LoginValidateException e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(IllegalVerificationCodeException.class)
    public ResponseEntity<ResponseDto> handleIllegalVerificationCodeException(IllegalVerificationCodeException e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(IllegalStatusException.class)
    public ResponseEntity<ResponseDto> handleIllegalStatusException(IllegalStatusException e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(UserDtoValidateException.class)
    public ResponseEntity<ResponseDto> handleUserDtoValidateException(UserDtoValidateException e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(IllegalRoleException.class)
    public ResponseEntity<ResponseDto> handleIllegalRoleException(IllegalRoleException e) {
        return getFormattedMessage(e);
    }
    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<ResponseDto> handleUsernameNotFoundException(UsernameNotFoundException e) {
        return getFormattedMessage(e);
    }
    @ExceptionHandler({AuthenticationNotVerifier.class,WaitingAvtivationException.class, DeactivatedActivationException.class})
    public ResponseEntity<ResponseDto> handleUAuthenticationNotVerifier(AuthenticationNotVerifier e) {
        return getFormattedMessage(e);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResponseDto> handleConstraintViolationException(ConstraintViolationException e) {
        ResponseDto response = new ResponseDto("error", String.format("%s : %s", LocalDateTime.now(), "Email address has invalid format"));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
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
