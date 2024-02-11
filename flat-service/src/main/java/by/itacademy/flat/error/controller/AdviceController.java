package by.itacademy.flat.error.controller;


import by.itacademy.flat.error.dto.ResponseDto;
import by.itacademy.flat.error.exception.IllegalValueException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class AdviceController {
    @ExceptionHandler(IllegalValueException.class)
    public ResponseEntity<ResponseDto> handleIllegalPriceException(IllegalValueException e) {
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
