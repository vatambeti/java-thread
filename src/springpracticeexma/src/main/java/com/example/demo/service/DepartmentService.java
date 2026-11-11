package com.example.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DepartmentService {

	 public DepartmentService() {
	        System.out.println("Department Object Created");
	    }

	    public void getDepartmentDetails() {

	        System.out.println("Department ID: 10");
	        System.out.println("Department Name: IT");
	        System.out.println("Manager Name: Suresh");

	    }
}
