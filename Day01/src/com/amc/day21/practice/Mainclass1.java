package com.amc.day21.practice;

public class Mainclass1 {

	public static void main(String[] args) {
		int n=5;
		int m=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m-i;j++) {
				if((m-i)%2!=0) {
					System.out.print("");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
			
		}

	}

}
