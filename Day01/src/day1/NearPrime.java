package day1;

import java.util.Scanner;

public class NearPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int p=n-1;
		int n1=n+1;
		while(true) 
		{
			if(isPrime(n)) {
				System.out.println(n);
				break;
			}
			if(isPrime(p)) {
				System.out.println(p);
				break;
			}
			if(isPrime(n1)) {
				System.out.println(n1);
				break;
			}
			
			p--;
			n1++;
		}
		
		

	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
