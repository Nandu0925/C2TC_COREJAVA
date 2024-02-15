package com.amc.day17.inheritance;

public class Student extends Citizen {
	private int rollNo;
	private String course;
	
	public Student() {
		super();
	}

	public Student(long adhar, long phone, String address, int rollNo, String course) {
		super(adhar, phone, address);
		this.rollNo = rollNo;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", course=" + course + ", Adhar=" + getAdhar() + ", Phone="
				+ getPhone() + ", Address=" + getAddress() + "]";
	}

}
