package com.amc.day12interface;

public class Circle implements Shape {
	private double radious;
	public Circle(double radious) {
		this.radious=radious;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radious*radious;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radious;
	}
	

}
