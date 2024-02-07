package com.amc.day15Multithreading;

public class Myclass extends Thread {
	private int n;
	private String msg;
	
	public Myclass(int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
				
			}catch(InterruptedException e) {
				System.out.println("thread is inturepted:"+e.getMessage());
				
			}
			System.out.println(msg+" "+i+" "+Thread.currentThread());
		}
	}

}
