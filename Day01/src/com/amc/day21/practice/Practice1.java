package com.amc.day21.practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		String perfect="l";
		for(int i=0;i<=n/2;i++) {
				sum=sum+i;
				if(sum==n) {
					perfect="it is perfect number";
				}
				else {
					perfect="not a perfect number";
				}
		
		}
		System.out.println(perfect);

	}

}
