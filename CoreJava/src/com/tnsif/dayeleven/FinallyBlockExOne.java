//Program to demonstrate Finally block 
package com.tnsif.dayeleven;

public class FinallyBlockExOne {
	void m1() {
		int a = 20, b = 0, c;
		try {
			System.out.println("I am in try block");
			c = a / b;
			System.exit(0);
			System.out.println("Result: " + c);
		} catch (ArithmeticException ae) {
			System.out.println("I am in catch block");
		} finally {
			System.out.println("I am in finally block");
		}
		System.out.println("Statement after finally block");
	}

	public static void main(String[] args) {
		FinallyBlockExOne obj = new FinallyBlockExOne();
		obj.m1();
	}
}