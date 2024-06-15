//Program to demonstrate Runnable interface
package com.tnsif.daythirteen;

public class UsingRunnable implements Runnable {
	Thread t;
	int h, l;
	String msg;

	public UsingRunnable(int h, int l, String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {
		for (int i = h; i > l; i--) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}