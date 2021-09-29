package com.example.application.Validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public class ValidatingServiceWithGroups {

    @Validated(OnCreate.class)
    void validateForCreate(@Valid InputWithGroups input) {

    }

    @Validated(OnUpdate.class)
    void validateForUpdate(@Valid InputWithGroups input) {

    }
}
