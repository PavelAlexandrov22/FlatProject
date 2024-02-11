package by.itacademy.audit.error.controller;

import by.itacademy.audit.error.dto.ResponseDto;
import by.itacademy.audit.error.exception.IllegalUUIDException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class AdviceController {

    @ExceptionHandler(IllegalUUIDException.class)
    public ResponseEntity<ResponseDto> handleConstraintViolationException(IllegalUUIDException e) {
        ResponseDto response = new ResponseDto("error", String.format("%s : %s", LocalDateTime.now(), "illegal uuid"));
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
