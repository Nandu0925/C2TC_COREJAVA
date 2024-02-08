package com.amc.day16collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDeemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new LinkedHashSet();
		s.add("first");
		s.add(1);
		s.add(false);
		s.add(new Float(4.6f));
		System.out.println(s);
		s.add(false);
		s.add(null);
		System.out.println(s);
		

	}

}
