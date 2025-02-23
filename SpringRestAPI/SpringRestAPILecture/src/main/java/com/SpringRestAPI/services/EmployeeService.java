package com.SpringRestAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringRestAPI.model.Employee;
import com.SpringRestAPI.model.UpdateEmployeeRequest;
import com.SpringRestAPI.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployeeList(){
		
		return employeeRepository.getAllEmployeeList();
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeeWithParams(String firstName,String lastName){
		return employeeRepository.getEmployeeWithParams(firstName, lastName);
		
	}
	public Employee savEmployee(Employee newEmployee) {
		return employeeRepository.saveEmployee(newEmployee);
	}
	
	public boolean deleteEmployee(String id) {
		return employeeRepository.deleteEmployee(id);
	}
	
	public Employee updatEmployee(String id,UpdateEmployeeRequest request) {
		return employeeRepository.updateEmployee(id, request);
	}
	
	

}
