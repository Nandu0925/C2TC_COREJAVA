//Program to demonstrate Has A Association
package com.tnsif.dayfive.association;

public class Bank {
	private String name;

	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}
