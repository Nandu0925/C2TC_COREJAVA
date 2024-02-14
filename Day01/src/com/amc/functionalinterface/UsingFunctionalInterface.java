package com.amc.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> con=MethodReferancing::show;
		con.accept("rahul");
		
		Supplier<String> supplier=()->"hello from supplier";
		con.accept(supplier.get());
		
		Predicate<Integer> predicate=(num)-> num>0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-24));
		
		BiFunction<Integer,Integer,Integer> max=(x,y)-> x>y?x:y;
		System.out.println(max.apply(5,7));

	}

}
