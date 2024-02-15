package com.amc.day15.Multithreading;

public class CakeCounter {
	int CakeCount=0;
	
	public synchronized void increment() {
		CakeCount++;
	}

}
