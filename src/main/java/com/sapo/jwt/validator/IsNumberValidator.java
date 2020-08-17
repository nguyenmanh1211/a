package com.sapo.jwt.validator;

import com.sapo.jwt.anotation.IsNumber;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsNumberValidator implements ConstraintValidator<IsNumber, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean status = true;
        if (!StringUtils.isNumeric(s)) status = false;
        return status;
    }
}
