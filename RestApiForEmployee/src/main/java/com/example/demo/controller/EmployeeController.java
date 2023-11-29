package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/add")
	public Employee createEmployee(@RequestBody Employee emp) {
		logger.info("Before StudentController PostMapping() Executing");
		return service.addEmployee(emp);
		
		
	}
	public Employee createEmploye(@RequestBody Employee emp) {
		logger.info(" EmployeeController");
		return service.addEmployee(emp);
	}
	
	
	
}
