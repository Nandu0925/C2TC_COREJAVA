package com.amc.day16collectionframework;
import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,1,5,3,5};
		Arrays.sort(arr);
//		System.out.println(arr);
		System.out.println("Duplicate values in array:");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]== arr[i+1]) {
				System.out.println(arr[i]);
			}
//		System.out.println("Duplicate values in array:");
			
		}
//		System.out.println("Duplicate values in array:");

	}

}
