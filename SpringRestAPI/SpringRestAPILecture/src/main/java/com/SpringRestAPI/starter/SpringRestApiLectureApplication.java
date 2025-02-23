package com.SpringRestAPI.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.SpringRestAPI"})
@SpringBootApplication
public class SpringRestApiLectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiLectureApplication.class, args);
	}

}
