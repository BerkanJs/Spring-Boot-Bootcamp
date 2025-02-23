package com.SpringRestAPI.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringRestAPI.model.Employee;

@Configuration
public class AppConfig {
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Berkan","Özçelik"));
		employeeList.add(new Employee("2","Emirhan","Alkan"));
		employeeList.add(new Employee("3","Emrehan","Bilgin"));
		employeeList.add(new Employee("4","Bora","Özçelik"));
		employeeList.add(new Employee("5","Harun","Kolçak"));
		return employeeList;
	}

}
