package com.SpringDataJPA.Starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@EntityScan(basePackages = {"com.SpringDataJPA"})
@SpringBootApplication
@ComponentScan(basePackages ={"com.SpringDataJPA"} )
@EnableJpaRepositories(basePackages = {"com.SpringDataJPA"})
public class Lesson3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson3Application.class, args);
	}

}
