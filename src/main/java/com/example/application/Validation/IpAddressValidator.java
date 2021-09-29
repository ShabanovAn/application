package com.example.application.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IpAddressValidator implements ConstraintValidator<IpAddress, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern =
        Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
        Matcher matcher = pattern.matcher(value);
        try{
            if (!matcher.matches()) {
                return false;
            } else {
                for (int i = 0; i <= 4 ; i++) {
                    int octet = Integer.parseInt(matcher.group(i));
                    if(octet >  255) {
                        return false;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
