package com.amc.day21.practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		if(isArmstrong(n)) {
			System.out.println("armstron");
		}else {
			System.out.println("not");
		}

	}
	static boolean isArmstrong(int n) {
		int temp=n;
		int cd=countdigit(n);
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int pow=(int)Math.pow(rem, cd);
			//cd--;
			sum=sum+pow;
			n=n/2;
		}
		return sum==temp;
	}
	static int countdigit(int n) {
		int count=0;
		while(n>0) {
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}
