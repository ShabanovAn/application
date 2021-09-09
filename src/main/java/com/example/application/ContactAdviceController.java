package com.example.application;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ContactAdviceController {

    @ExceptionHandler(value = ContactException.class)
    public ResponseEntity<Object> getExceptionContact(ContactException contactException) {
        return new ResponseEntity<>(contactException.getMessage(), HttpStatus.BAD_REQUEST);

    }
}
