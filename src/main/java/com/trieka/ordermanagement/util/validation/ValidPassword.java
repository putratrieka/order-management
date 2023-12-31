package com.trieka.ordermanagement.util.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.trieka.ordermanagement.util.validation.impl.PasswordValidation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = {PasswordValidation.class})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
	
	public abstract String message() default "Invalid password.";
	
	public abstract Class<?>[] groups() default {};

	public abstract Class<? extends Payload>[] payload() default {}; 

}
