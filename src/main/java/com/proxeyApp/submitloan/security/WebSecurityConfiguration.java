//package com.proxeyApp.submitloan.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//// Make the below class to extend WebSecurityConfigurerAdapter
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter
//{
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		  http .authorizeRequests()
//		  		.anyRequest().authenticated()
//				  // httpBasic authentication
//		  		.and() .httpBasic();
//	}
//}