package com.amc.day18.javagenarics;

public class GenericTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTest<Integer> obj = new GenericTest<>();
		obj.add(18);
		System.out.println(obj.get());
		GenericTest<String> objOne = new GenericTest<>();
		objOne.add("hello");
		System.out.println(objOne.get());

	}

}
