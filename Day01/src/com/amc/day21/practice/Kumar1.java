package com.amc.day21.practice;

public class Kumar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			for(int j=1;j<=100;j++) {
				if(i%j==0) {
					if(i==1||i==j)
					System.out.println(i);
				}
			}
			System.out.println();
			
		}

	}

}
