package com.amc.day15Multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tOne = new Myclass(5,"First Thread");
		Thread tTwo = new Myclass(7,"Second Thread");
		
		tOne.start();
		tTwo.start();
		

	}

}
