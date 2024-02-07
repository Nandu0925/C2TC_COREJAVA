package com.amc.day12Exception;

import java.util.Scanner;

public class UserdefinedExceptionDemo {
	public static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("your age is invlid! and you are not eligible to vote");
			
		}else {
			System.out.println("you are eligible to vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException ex) {
			System.err.println("invlaid age,please check your age:"+ex.getMessage());
		}
		

	}

}
