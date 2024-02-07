package com.amc.day15Multithreading;

public class Synchronized {
	static CakeCounter counter = new CakeCounter();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread teamOne = new Thread(new Team(counter));
		Thread teamTwo = new Thread(new Team(counter));
		
		teamOne.start();
		teamTwo.start();
		
		try {
			teamOne.join();
			teamTwo.join();
			
		}catch(Exception ex) {
			
		}
		System.out.println(counter.CakeCount);
		

	}

}
