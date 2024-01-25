package com.amc.day11.abstractclass;

public class Rectangle extends Shape {
	float length,bredth;
	public Rectangle() {
		this.length = 3.0f;
		this.bredth = 4.0f;
		
	}
	public Rectangle(float length,float bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	public void calculateArea() {
		area=length*bredth;
	}

}
