//executor class
package com.tnsif.daythirteen;

public class RunnableDemo {
	public static void main(String[] args) {
		new UsingRunnable(30, 20, "Hello");
		/*
		 * Another way of creating thread using Runnable Thread t1=new Thread(new
		 * UsingRunnable(10,1,"First")); Thread t2=new Thread(new
		 * UsingRunnable(5,1,"Second")); t1.start(); t2.start();
		 */
		System.out.println("-------------------------------------------------------");
	}
}