package com.trieka.ordermanagement.util.validation;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	public static <T> T parse(Object o, Class<T> targetClass) {
		if (o == null) {
			return null;
		}
		try {
			return mapper.convertValue(o, targetClass);
		} catch (Exception e) {
			return null;
		}
	}

}
