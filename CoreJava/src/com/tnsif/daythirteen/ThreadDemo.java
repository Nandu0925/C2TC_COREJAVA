//Executor class
package com.tnsif.daythirteen;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "First");
		ChildThread t2 = new ChildThread(10, "Second");

		t1.start();
		t2.start();

		
		System.out.println("-----------------------End of Main--------------------------");
	}
}
