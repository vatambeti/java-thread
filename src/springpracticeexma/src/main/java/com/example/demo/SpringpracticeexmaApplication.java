package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.EmployeeController;
import com.example.demo.service.DepartmentService;

@SpringBootApplication
public class SpringpracticeexmaApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringpracticeexmaApplication.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(SpringpracticeexmaApplication.class, args);
		 EmployeeController controller =
	                context.getBean(EmployeeController.class);

	        controller.displayEmployee();
	        
	        DepartmentService dpj1=context.getBean(DepartmentService.class);
	        DepartmentService dpj2=context.getBean(DepartmentService.class);
	        
	        dpj1.getDepartmentDetails();

	        System.out.println("Are Both Objects Same? " + (dpj1 == dpj2));

	        context.close();
	}

}
