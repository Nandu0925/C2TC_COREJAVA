//Program to demonstrate Stream API 
package com.tnsif.daytwenty;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, -3, 4, 5, -6, 7, 8);

		// retrieve the stream
		Stream<Integer> stream = intList.stream();

		// Filtered Stream of Positive numbers
		stream = stream.filter((a) -> a > 0);

		// reduce to return maximum number
		Optional<Integer> result = stream.reduce((a, b) -> a > b ? a : b);
		if (result.isPresent()) {
			System.out.println("Result:" + result.get());
		}

		// retrieve the stream
		stream = intList.stream();

		// Filtered Stream of Positive numbers
		stream = stream.filter((a) -> a > 0);

		// reduce to sum of all positive numbers
		result = stream.reduce((a, b) -> a + b);
		if (result.isPresent()) {
			System.out.println("Result:" + result.get());
		}

		// retrieve the stream
		stream = intList.stream();

		// Filtered Stream of even numbers
		stream = stream.filter((a) -> a % 2 == 0);

		//reduce to sum of even numbers
		result = stream.reduce((a, b) -> a + b);
		if (result.isPresent()) {
			System.out.println("Result:" + result.get());
		}
	}

}
