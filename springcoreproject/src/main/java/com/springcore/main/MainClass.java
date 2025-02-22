package com.springcore.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.config.AppConfig;
import com.springcore.model.User;
import com.springcore.services.LoginService;
import com.springcore.services.UserServices;


public class MainClass {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	UserServices userServices = context.getBean(UserServices.class);
	
	for(User user : userServices.getUserList()) {
		System.out.println(user);
	}
	LoginService loginService=new LoginService();
	loginService.login();
	 
	
	
	
		
	}
	

}
