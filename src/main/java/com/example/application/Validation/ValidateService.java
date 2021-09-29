package com.example.application.Validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
//@Validated
public class ValidateService {

    void validateInput(@Valid Input input) {

    }
}
