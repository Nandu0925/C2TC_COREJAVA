package com.amc.day20.javaStreams;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,5,4,3);
//		list.stream().distinct().forEach(System.out::println);
//		System.out.println(list);
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
		System.out.println(list.stream().filter(i->i%3==0).reduce(0, (a,b)->Integer.sum(a, b)));
		System.out.println(list.stream().filter(i->i%5==0).reduce(0, Integer::sum));
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).reduce(0, (c,e)->(c+e)));
		

	}

}
