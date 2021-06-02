package com.example.demovalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserValidator implements
        ConstraintValidator<UserConstraint, User> {

    @Override
    public void initialize(UserConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        //validate object user here
        //you can do everything here
        return user.getAge() != null;
    }
}
