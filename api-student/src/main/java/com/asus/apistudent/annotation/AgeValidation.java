package com.asus.apistudent.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = AgeValidator.class)
public @interface AgeValidation {
	
    String message() default "Must be greater than 0 and smaller than 100";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

    long value();

}
