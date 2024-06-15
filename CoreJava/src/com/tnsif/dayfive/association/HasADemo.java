//Program to demonstrate HAS A association
package com.tnsif.dayfive.association;

public class HasADemo {
	public static void main (String[] args) 
    { 
        Bank b = new Bank("Axis"); 
        Employee e = new Employee("Himanshi"); 
        System.out.println(e.getEmployeeName() + 
            " is an employee of " + b.getBankName()); 
    }
}
