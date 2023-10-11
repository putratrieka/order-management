package com.trieka.ordermanagement.config;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.trieka.ordermanagement.security.AuthTokenFilter;
import com.trieka.ordermanagement.security.TokenProvider;


public class AuthTokenConfigure extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>{
	
	private TokenProvider tokenProvider;
	
	public AuthTokenConfigure(TokenProvider provider) {
		this.tokenProvider = provider;
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		AuthTokenFilter customFilter = new AuthTokenFilter(tokenProvider);
		http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
	}

}
