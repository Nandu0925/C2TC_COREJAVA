package com.amc.day18.javagenarics;

public class GenericTest<T> {
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}

}
