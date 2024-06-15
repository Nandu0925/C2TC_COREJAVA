//Program to demonstrate user defined exception handling
package com.tnsif.daytwelve;

import java.util.Scanner;

public class AgeTestDemo {

	static void validate(int age) throws InvalidAgeException {

		if (age < 18)
			throw new InvalidAgeException("Invalid Age, You are not eligible to vote");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

		try {
			validate(age); // function which rise the exception
		} catch (InvalidAgeException e) {
			System.err.println("Caught an Exception: \n " + e.getMessage());
		}
		sc.close();
	}
}