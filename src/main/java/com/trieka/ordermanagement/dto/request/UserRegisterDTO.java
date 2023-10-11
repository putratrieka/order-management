package com.trieka.ordermanagement.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.trieka.ordermanagement.util.validation.ValidPassword;
import com.trieka.ordermanagement.util.validation.ValidPhoneNumber;
import com.trieka.ordermanagement.util.validation.impl.PhoneValidation.PhoneValidatorType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class UserRegisterDTO {
	
	@NotBlank
	@Size(min = 10, max = 13)
	@ValidPhoneNumber(type = PhoneValidatorType.REGISTER)
	private String phone;
	
	@ValidPassword
	@Size(min = 6, max = 16)
	private String password;

	@NotBlank
	@Size(max = 60)
	private String name;

}
