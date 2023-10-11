package com.trieka.ordermanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trieka.ordermanagement.service.IDogService;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Service
public class DogService implements IDogService {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@PostConstruct
	public void getDogs() {
		String url = "https://dog.ceo/dog-api/";
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		log.debug("response --> {}",response);
		
	}
}
