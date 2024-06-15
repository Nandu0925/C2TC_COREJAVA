//Program to demonstrate user defined generic class
package com.tnsif.dayfifteen.generics;

//Generic Class
class GenericTest<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}
}

public class GenericClassTest {

	public static void main(String[] args) {
		GenericTest<String> obj=new GenericTest<String>();
		obj.add("Hello");
		System.out.println(obj.get());
		
		GenericTest<Integer> obj1=new GenericTest<Integer>();
		obj1.add(10);
		System.out.println(obj1.get());
	}

}