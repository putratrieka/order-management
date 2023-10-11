package com.trieka.ordermanagement.dto.request;

import lombok.Data;

@Data
public class UserLoginRequestDTO {
	
	private String phone;
	
	private String password;

}
