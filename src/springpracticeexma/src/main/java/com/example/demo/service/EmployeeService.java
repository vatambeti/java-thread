package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
private final EmployeeRepository employeerepository;

public EmployeeService(EmployeeRepository employeerepository) {
	this.employeerepository=employeerepository;
}

public void addEmployee() {
	System.out.println("employee details saving");
	employeerepository.saveEmployee();
}

	public void getEmployee() {
		System.out.println("employee details");
		System.out.println("employee id:123");
		System.out.println("employee name:abc");
	}
}
