//Program to demonstrate predefined annotation
package com.tnsif.daytwentyone.predefinedannotation;

import java.util.ArrayList;
import java.util.List;

public class PredefinedAnnotationDemo {
	@SuppressWarnings(value = { "unchecked" })

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes") //remove warning for Raw type
		List al = new ArrayList();
		Student s2 = new Student(102, "Rashmi", "ECE");
		al.add(10);
		al.add(22.22f);
		al.add(new Student(101, "Gayatri", "CS"));
		al.add("SKSJIT");
		al.add(s2);

	}
}
