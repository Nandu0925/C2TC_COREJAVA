//Program to demonstrate handling runtime exception
package com.tnsif.dayeleven;

import java.util.Scanner;

public class HandlingRuntimeException {

	public static void divide(int x, int y) {
		int z = 0;
		try {
			z = x / y;
			System.out.println("Result of division is z: " + z);
		} catch (ArithmeticException np) {
			System.err.println("A number cannot be divided by zero");
		}
	}

	public static void divide(float x, float y) {
		float z = 0;
		z = x / y;
		System.out.println("Result of division is z: " + z);
	}

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		
		// Apply try-catch block to handle runtime exception.
		try {
			System.out.println("I am in try block");
			System.out.println("Enter two numbers ");
			x = Integer.parseInt(sc.nextLine());// runtime exception.
			y = Integer.parseInt(sc.nextLine());// runtime exception.
			divide(x,y); 
			
		} catch (Exception ae) {
			System.err.println("Error!, Invalid Input : " + ae.getMessage());
		}
		
		sc.close();
		
		divide(12.0f, 0f);
	}
}
