package com.amc.day19.functionalinterface;

public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s=()->{return "hello world";};
		System.out.println(s.greet());

	}

}
