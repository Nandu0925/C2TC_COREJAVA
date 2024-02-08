package com.amc.day15Multithreading;

public class CakeCounter {
	int CakeCount=0;
	
	public synchronized void increment() {
		CakeCount++;
	}

}
