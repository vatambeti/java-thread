package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	public void saveEmployee() {
	    System.out.println("Employee Saved Successfully");
	}

}
