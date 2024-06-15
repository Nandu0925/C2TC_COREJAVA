//Program to implement interface
package com.tnsif.dayeight.usinginterface;

public class SavingAccount extends Person implements Bank {
	private int accNo;
	private float balance;

	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	//implements Bank method
	@Override
	public void deposit(float amount) {
		if (amount > DEPOSIT_LIMIT)
			System.out.println("Daily limit exceeds...");
		else {
			balance += amount;
			System.out.println("Rs. "+amount+" deposited successfully..."  );
		}
	}

	//implements Bank method
	@Override
	public void withdraw(float amount) {
		if (amount <= balance - MINBAL) {
			balance -= amount;
			System.out.println("Rs. "+amount+" withdraw successfully..");
		} else
			System.out.println("Insufficient Balance...can't withdraw");

	}

	@Override
	public String toString() {
		return "SavingAccount [Name =" + getName() + "\tCity = " + getCity() + "\taccNo=" + accNo + ", balance="
				+ balance + "]";
	}

}
