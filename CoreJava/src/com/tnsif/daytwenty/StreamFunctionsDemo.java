//Program to demonstrate Stream API 
package com.tnsif.daytwenty;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionsDemo {

	/*
	 * //retrieve the stream public static Stream<String> getStream(List<String>
	 * list) { return list.stream(); }
	 */

	// Count the empty Strings
	public static long countEmptyStrings(Stream<String> stream) {
		long count = 0;
		count = stream.filter(x -> x.isEmpty()).count();
		return count;
	}

	// Count String with length more than given number
	public static long countStrings(Stream<String> stream, int n) {
		long num = stream.filter(x -> x.length() > n).count();
		return num;
	}

	// Remove all empty Strings from List
	public static List<String> stringList(Stream<String> stream) {
		List<String> filtered = stream.filter(x -> !x.isEmpty()).collect(Collectors.toList());
		return filtered;
	}

	// Create a List with String more than n characters
	public static List<String> getStrings(Stream<String> stream, int n) {
		List<String> filteredList = stream.filter(x -> x.length() > n).collect(Collectors.toList());
		return filteredList;
	}

	// Create List of square of all distinct numbers
	public static List<Integer> getSquareList(Stream<Integer> stream) {
		List<Integer> squareList = stream.map(i -> i * i).distinct().collect(Collectors.toList());
		return squareList;
	}
	
	public static void showStatistics(Stream<Integer> stream) {
		IntSummaryStatistics stats = stream.mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
	}

	public static void main(String[] args) {

		
		List<String> strList = Arrays.asList("Nashik", "", "Bangalore", "", "Chennai", "Mumbai", "Pune"); // source
		System.out.println("List of Cities is "+strList);
		
		// retrieve the stream
		Stream<String> stream = strList.stream();
		
		// Count the empty strings
		long count = countEmptyStrings(strList.stream());
		System.out.printf("List %s has %d empty strings %n", strList, count);

		count = countStrings(strList.stream(), 8);
		System.out.printf("List %s has %d strings of length more than 8 %n", strList, count);

		List<String> filteredList = stringList(strList.stream());
		System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filteredList);

		filteredList = getStrings(strList.stream(),6);
		System.out.printf("Original List : %s, Cities length more than 6: %s %n", strList, filteredList);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		// retrieve the stream
		Stream<Integer> stream1=numbers.stream();
		
		List<Integer> filteredNumberList=getSquareList(stream1);
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

		
		// Get count, min, max, sum, and average for numbers
		showStatistics(numbers.stream());
		

	}

}
