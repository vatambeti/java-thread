package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

	
	public void sendEmail() {
		System.out.println("Welcome Email Sent");
	}
}
