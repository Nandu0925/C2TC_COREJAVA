package com.amc.day21.practice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int even=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				even++;
				
			}
			n=n/10;
		}
		System.out.println(even);

	}

}
