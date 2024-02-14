package com.amc.day14Strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String strOne="hello";
		String sOne = new String("hello");
		System.out.println(str==strOne);
		System.out.println(str==sOne);
		System.out.println(str.equals(sOne));

	}

}
