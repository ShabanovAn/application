package com.example.application.Validation;

import org.springframework.stereotype.Service;

import javax.validation.*;
import java.util.Set;

@Service
public class ProgrammaticallyValidatingService {

    private Validator validator;

    public ProgrammaticallyValidatingService(Validator validator) {
        this.validator = validator;
    }

    public ProgrammaticallyValidatingService() {
    }

    public void validateInputWithInjectedValidator(Input input) {
        Set<ConstraintViolation<Input>> violations = validator.validate(input);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

    void validateInput(Input input) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Input>> violations = validator.validate(input);
        if(!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}
