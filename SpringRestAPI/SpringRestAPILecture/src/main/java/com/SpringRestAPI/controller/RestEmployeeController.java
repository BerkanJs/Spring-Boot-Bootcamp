package com.SpringRestAPI.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestAPI.model.Employee;
import com.SpringRestAPI.model.UpdateEmployeeRequest;
import com.SpringRestAPI.services.EmployeeService;
@RequestMapping("/rest/api/employee") ///rest/api bu adrese req gelirse List Methodunu calıstır
@RestController
public class RestEmployeeController {
	
	@Autowired // Controller katmanından service katmanına gitmek için
	//autowired anatasyonunu kullanarak contexte olusmus olan servisi alıp 
	//controllera koyup enjekte etmemiz gerekiyor
	
	private EmployeeService employeeService;
	
	@GetMapping(path = "/list")
	public List<Employee> getAllEmployeeList(){
		return employeeService.getAllEmployeeList();
		

	}
	
	@GetMapping(path = "/list/{id}")
	public Employee getEmployeeById(@PathVariable(name = "id",required = true)String id) {
		return employeeService.getEmployeeById(id);
		
	}
	
	
	@GetMapping(path="/with-params")
	public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName",required = false) String firstName,
			@RequestParam(name = "lastName") String lastName){
		return employeeService.getEmployeeWithParams(firstName, lastName);
	}
	
    @PostMapping(path = "/save-employee")
    public Employee saveEplEmployee(@RequestBody Employee newEmpoloyee) {
    	return employeeService.savEmployee(newEmpoloyee);
    }
    
    @DeleteMapping(path = "/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id")String id) {
    	return employeeService.deleteEmployee(id);
    	
    }
    
    
    @PutMapping(path = "/update-employee/{id}")
    public Employee updateEmployee(@PathVariable(name="id") String id,@RequestBody UpdateEmployeeRequest request) {
    	return employeeService.updatEmployee(id, request);
    }

}
