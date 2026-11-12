package com.example.demo.entity;

public class User {
	
	public int id;
	public String name;
	public String dept;
	
	public User(int id,String name,String dept) {
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}

}
