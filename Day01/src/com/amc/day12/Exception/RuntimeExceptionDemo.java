package com.amc.day12.Exception;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[];
		arr=new int[] {1,2,3,4};
		System.out.println(arr[4]);
		
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("the error message is:" +ex.getMessage());
			
		}
		
		System.out.println("end of the program");
		}

	}


