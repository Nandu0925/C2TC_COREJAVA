//Program to demonstrate User Defined Exception class
package com.tnsif.daytwelve;

public class InvalidAgeException extends Exception {// extends Exception class
	public InvalidAgeException() {
		super("Invalid Age");
	}

	InvalidAgeException(String message) {
		super(message);
	}

}
