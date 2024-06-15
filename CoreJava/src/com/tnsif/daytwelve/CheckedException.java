//Program to demonstrate throws keyword to declare an exception
package com.tnsif.daytwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	static String acceptText() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string : ");
		String str = br.readLine();
		return str;
	}

	public static void main(String[] args) {
		try {
			String str = acceptText();
			System.out.println("Your string is " + str);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
