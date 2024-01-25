package com.amc.day11.abstractclass;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Rectangle rOne=new Rectangle(8.0f,9.0f);
//        rOne.calculateArea();
//        rOne.show();
        
        Square sOne=new Square();
        sOne.calculateArea();
        sOne.show();
        
        //dynamic binding
        Shape shape;
        shape=new Square(3);
        shape.calculateArea();
        shape.show();
        
        shape=new Rectangle();
        shape.calculateArea();
        shape.show();
	}

}
