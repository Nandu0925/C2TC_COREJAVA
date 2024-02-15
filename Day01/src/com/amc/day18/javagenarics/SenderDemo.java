package com.amc.day18.javagenarics;

public class SenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender<String> stringSender=new Sender<>();
		stringSender.setMessage("hello");
		stringSender.sendMessage();
		
		Sender<Person> personSender=new Sender<>();
		personSender.setMessage(new Person("amit","andhra"));
		personSender.sendMessage();

	}

}
