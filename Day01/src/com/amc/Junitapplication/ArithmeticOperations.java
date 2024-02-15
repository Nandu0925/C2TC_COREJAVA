package com.amc.Junitapplication;

public class ArithmeticOperations {
	public static int getSquare(int number) {
		return number+number;
	}
	public static int findMaximum(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
