//Program to demonstrate array in Java
package com.tnsif.dayten;

public class ArrayDemoOne {
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
	}

	// variable argument function
	public static int getSum(int... n) {
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;
	}

	public static void main(String args[])
	{
		int n = 10;
		int a[]; // declaration
		a = new int[n]; // instantiation

		// displaying the array
		printArray(a);

		// assigning values in array a
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;

		printArray(a);

		int b[] = { 10, 20, 30, 40, 50 }; // initialization at the time of declaration
		printArray(b);

		//calling variable argument function
		System.out.println("sum of array elements is : " + getSum(b));
		System.out.println("sum of array elements is : " + getSum(12, 20));

		b[2] = 999; // assigning single element
		// RTE - ArrayIndexOutOfBoundsException
		// b[20]=10;
		printArray(b);

		// Operations of Array
		int oddcount = 0, evencount = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0)
				evencount++;
			else
				oddcount++;
		}

		System.out.println("Odd numbers : " + oddcount + "\tEven numbers : " + evencount);
		System.out.println();
		System.out.println("---------------------------------------");

		int c[];		
		// printArray(c); //CTE

		String s[] = { "Hello", "How are you?" };
		System.out.println(s);

		// for..each
		for (String ss : s)
			System.out.print(ss + "\t");

	}

}
