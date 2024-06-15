//Program to demonstrate interthread communication
package com.tnsif.dayfourteen.interthreadcommunication;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		
		//Shared Resource
		Agent obj=new Agent();
		
		Producer p1=new Producer(obj);
		Consumer c1=new Consumer(obj);
		
		p1.start(); //Producer thread
		c1.start(); //Consumer thread
		
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}