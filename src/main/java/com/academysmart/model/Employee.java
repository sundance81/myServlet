package com.academysmart.model;

public class Employee {
	//TODO implement model for employee
	String name = "";
	String sirname = "";
	String email = "";
	int id;
	static int count;
	
	public Employee() {
	count++;	
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
}
}
