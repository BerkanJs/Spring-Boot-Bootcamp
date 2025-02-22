package com.springcore.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import com.springcore.config.AppConfig;
@Repository
public class LoginService {
	
	
	

 public void login() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserServices userService= context.getBean(UserServices.class);
	
	 
 }
}
