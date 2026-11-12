package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public class UserService {

	public User getUser() {
		return new User(
				1,"ajay","IT");
	}
}
