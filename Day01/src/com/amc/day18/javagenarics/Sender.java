package com.amc.day18.javagenarics;

public class Sender<T> {
	T message;
	
	public void setMessage(T message) {
		this.message=message;
	}
	public void sendMessage() {
		System.out.println(message);

}
}
