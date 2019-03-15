package com.aopassignment;

public class Circle {

	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("circle's setter is called");
		throw(new RuntimeException());
	}
	
	public String setNameandReturn(String name) {
		this.name = name;
		System.out.println("circle's setter is called");
		return name;  
	}
}
