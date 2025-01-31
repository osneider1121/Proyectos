package com.oman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.oman.service.userService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	private userService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//usuarios fijos
		/*
		auth.inMemoryAuthentication()
		.withUser("user")
		.password("123")
		.roles("USER")
		.and()
		.withUser("admin")
		.password("admin")
		.roles("USER","ADMIN");
		*/
		auth.userDetailsService(userDetailsService).passwordEncoder(bcrypt);
	}
	protected void configure(HttpSecurity http)throws Exception {
		http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		
	}
}
