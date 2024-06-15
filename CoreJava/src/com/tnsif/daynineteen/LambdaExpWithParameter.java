//Program to demonstrate Lambda expression with parameters
package com.tnsif.daynineteen;

public class LambdaExpWithParameter {

	public static void main(String[] args) {
		
		int x = 5;
		Cube c = (int a) -> {
			return (a * a * a);
		};

		int res = c.calculate(5);
		System.out.println(res);

//			Cube c = (int a)->a*a*a;  // Finding the cube of a number
//			int result = c.calculate(x); 
//			System.out.println(result); 

		IsOdd o = (a) -> a % 2 != 0 ? true : false;

		boolean res1 = o.CheckOdd(7);
		System.out.println("Result is :" + res1);

	}

}