//Program to demonstrate Multiple catch block
package com.tnsif.dayeleven;

public class MultipleCatchEx {

	public static int divide(int x, int y) {
		int z = 0;

		z = x / y;
		System.out.println("Result of division is z: " + z);

		return z;
	}

	public static void main(String[] args) {
		int x, y, z;

		try {
			x = Integer.parseInt(args[0]); // command line args
			y = Integer.parseInt(args[1]);
			z = divide(x, y);
			System.out.println("z = " + z);
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.err.println("Error! " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error......" + e.getMessage());
		}
		System.out.println("Out of try-catch block");
	}
}
