package com.example.application.Validation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ErrorHandlingControllerAdvice {


//    @ExceptionHandler(ConstraintViolationException.class)
//    @ResponseStatus(HttpStatus.BAD_GATEWAY)
//    @ResponseBody
//    ValidationErrorResponse onConstraintValidationException(ConstraintViolationException e) {
//        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
//        for (ConstraintViolation constraintViolation : e.getConstraintViolations()) {
//
//
//        }
//    }
}
