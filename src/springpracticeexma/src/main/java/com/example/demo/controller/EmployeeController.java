package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.EmployeeService;

@Component

public class EmployeeController {
//constructor injection
	// private final EmployeeService employeeService;
	
//	 public EmployeeController(EmployeeService employeeService) {
//		 this.employeeService=employeeService;
//	 }
	
	//setter injection
//	private EmployeeService employeeService;;
//	 @Autowired
//	    public void setEmployeeService(EmployeeService employeeService) {
//
//	        this.employeeService = employeeService;
//
//	    }
// field injection
	@Autowired
	private EmployeeService employeeService;
	 public void displayEmployee() {
		 System.out.println("employee controller calling");
		 employeeService.getEmployee();
	 }
}
