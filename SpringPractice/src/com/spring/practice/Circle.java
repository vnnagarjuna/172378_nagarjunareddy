package com.spring.practice;

public class Circle {
	private String type;
	


public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
public void draw() {
	 System.out.println(getType() + " of circle");
}
}
