package com.amc.Junitapplication;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled

public class JunitLifeCycle {
	@Test
	public void testMethodOne() {
		System.out.println("testing method one");
	}
	@Test
	public void testMethodTwo() {
		System.out.println("testing method two");
	}
	@BeforeAll
	public static void testBeforeAll() {
		System.out.println("---test beforee all methods---");
	}
	@AfterAll
	public static void testAfterAll() {
		System.out.println("---after all method---");
	}
	@BeforeEach
	public void testBeforeEachTestMethod() {
		System.out.println("test before each test method");
	}
	@AfterEach
	public void testAfterEachTestMethod() {
		System.out.println("test after each test method");
	}

}
