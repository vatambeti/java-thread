package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.PaymentService;

@Configuration
public class AppConfig {

	@Bean
	public PaymentService paymentservice() {
		return new PaymentService();
	}
}
