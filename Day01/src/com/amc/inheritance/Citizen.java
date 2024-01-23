package com.amc.inheritance;

public class Citizen {
	private long adhar;
	private long phone;
	private String address;
	
	public Citizen() {
		System.out.println("default constructor");
	}

	public Citizen(long adhar, long phone, String address) {
		super();
		this.adhar = adhar;
		this.phone = phone;
		this.address = address;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Citizen [adhar=" + adhar + ", phone=" + phone + ", address=" + address + "]";
	}
//	
//	void m1() {
//		
//	}

}
