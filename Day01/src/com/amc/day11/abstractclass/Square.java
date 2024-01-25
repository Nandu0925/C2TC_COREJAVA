package com.amc.day11.abstractclass;

public class Square extends Shape {
	float side;
	
	public Square() {
		this.side=2.0f;
	}
	public Square(float side) {
		this.side=side;
	}

	@Override
	public void calculateArea() {
		
		// TODO Auto-generated method stub
		area=side*side;
	}

}
