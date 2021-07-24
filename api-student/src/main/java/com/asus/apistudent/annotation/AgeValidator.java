package com.asus.apistudent.annotation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class AgeValidator implements ConstraintValidator<AgeValidation, Integer>{
	@Min(value = 1, message = "User age must be greater than 0")
	@Max(value = 100, message = "User age must be smaller than 100")
    protected long minAge;

    @Override
    public void initialize(AgeValidation ageValue) {
        this.minAge = ageValue.value();
    }
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

        if(value > 0 && value < 100) {
        	return true;
        }
        	return false;

	}



}
