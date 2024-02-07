package com.amc.day12interface;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(length*width);
	}

}
