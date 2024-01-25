package com.amc.day11.abstractclass;

public abstract class Shape {
	float area;
	abstract void calculateArea();//no implementation provided
	
	void show() {
		System.out.println("Area of the shape"+area);
	}
}
