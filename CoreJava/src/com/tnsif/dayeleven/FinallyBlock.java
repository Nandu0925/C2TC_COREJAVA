//Program to demonstrate Finally block
package com.tnsif.dayeleven;

import java.util.Scanner;

public class FinallyBlock {

	public static void divide(int x, int y) {
		int z = 0;
		try {
			z = x / y;
			System.out.println("Result of division is z: " + z);
		} catch (ArithmeticException np) {
			System.err.println("A number cannot be divided by zero");
		}

	}

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		// Apply try-catch block to handle runtime exception.
		try {
			System.out.println("I am in try block");
			System.out.println("Enter two numbers ");
			x = Integer.parseInt(sc.nextLine());// runtime exception.
			y = Integer.parseInt(sc.nextLine());// runtime exception.
			divide(x, y);

		} catch (Exception ae) {
			System.err.println("Error!, Invalid Input : " + ae.getMessage());
		} finally {
			System.out.println("In Finally block");
		}

		sc.close();

	}
}
