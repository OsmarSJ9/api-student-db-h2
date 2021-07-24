package com.asus.apistudent.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class AgeValidator implements ConstraintValidator<AgeValidation, Integer> {

	protected long minAge;

	@Override
	public void initialize(AgeValidation ageValue) {
		this.minAge = ageValue.value();
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

		if (value > 0 && value < 100) {
			return true;
		}
		return false;

	}

}
