package com.amc.Junitapplication;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FirstTestClass {
	@Disabled
	@Test
	public void squareTest() {
		int sq=ArithmeticOperations.getSquare(-2);
		assertEquals(4,sq);
	}
	@Test
	public void findMaximumArrayTest() {
		int[] a= {-12,-45,-63,-78};
		int max=ArithmeticOperations.findMaximum(a);
		assertEquals(-12,max);
		
	}

}
