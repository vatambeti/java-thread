package com.example.demo.test;

import com.example.demo.annotation.EmployeeInfo;
import com.example.demo.annotation.EmployeeRole;
import com.example.demo.entity.AdminEmployee;
import com.example.demo.entity.Employee;

public class AnnotationTest {
	
	public static void main(String[] args) {
		Class<Employee> Employeeclass=Employee.class;
		if(Employeeclass.isAnnotationPresent(EmployeeInfo.class)) {
			System.out.println("annotation is available");
			
		}else {
			System.out.println("annotation is not available");
		}
		Class<AdminEmployee> emprole=AdminEmployee.class;
		if(emprole.isAnnotationPresent(EmployeeRole.class)) {
System.out.println("annotation is available");
			
		}else {
			System.out.println("annotation is not available");
		}
	}

}
