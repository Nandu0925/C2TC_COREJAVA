package com.amc.day09.overriding;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		//Dynamic binding you crate child class object to the parent class variable as a refarence
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}
