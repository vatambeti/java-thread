package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.annotation.EmployeeInfo;
import com.example.demo.annotation.EmployeeRole;
import com.example.demo.entity.AdminEmployee;
import com.example.demo.entity.Employee;
import com.example.demo.entity.User;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.UserService;

@RestController

public class EmployeeController {
//constructor injection
	 private final EmployeeService employeeService;
	
	 public EmployeeController(EmployeeService employeeService) {
		 this.employeeService=employeeService;
	 }
	
	//setter injection
//	private EmployeeService employeeService;;
//	 @Autowired
//	    public void setEmployeeService(EmployeeService employeeService) {
//
//	        this.employeeService = employeeService;
//
//	    }
// field injection
//	@Autowired
//	private EmployeeService employeeService;
	 @Autowired
	 private UserService userService;

//	    public EmployeeController(UserService userService) {
//	        this.userService = userService;
//	    }

	 
	 
	 public void displayEmployee() {
		 System.out.println("employee controller calling");

		 EmployeeInfo info = Employee.class.getAnnotation(EmployeeInfo.class);
		 if (info != null) {
			 System.out.println("ID: " + info.id());
			 System.out.println("Name: " + info.name());
			 System.out.println("Department: " + info.deptartment());
		 }
		 
		 EmployeeRole role=AdminEmployee.class.getAnnotation(EmployeeRole.class);
		 System.out.println("role :"+role.role());
		 System.out.println("accesslevel : "+role.accessLevel());

		 employeeService.getEmployee();
		 employeeService.addEmployee();
		 
	 }
	 
	 @GetMapping("/employee")
	 public User Getuser() {
		 return userService.getUser();
	 }
}
