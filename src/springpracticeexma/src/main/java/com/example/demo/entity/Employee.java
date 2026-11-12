package com.example.demo.entity;

import com.example.demo.annotation.EmployeeInfo;

@EmployeeInfo(
		id=101,
		name="Rahul",
		deptartment="developement")
 
public class Employee {

	public void displayEmployee() {
		System.out.println("employee dep :cse");
	}
}
