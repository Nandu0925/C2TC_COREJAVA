package com.amc.day13Arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[]=new Student[5];
		arr[0]=new Student(11," rahul");
		arr[1]=new Student(12," nanda");
		arr[2]=new Student(13," kumar");
		arr[3]=new Student(14," deepesh");
		arr[4]=new Student(15," raju");
		
		for(Student s:arr) {
			System.out.println(s.getAge()+""+s.getName());
		}
		

	}
}

