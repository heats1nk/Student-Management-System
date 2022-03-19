package com.studentmgmt.org;

public class Student {
	
	private String firstName;
	private String lastName;
	private int rollNo;
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, int rollNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}
	
	public void setName(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}
	
	
	public String getName() {
		return ("Fname: " + this.firstName + "\tLname: " + this.lastName);
	}
	
	public void setDetails(int rollNo, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}
	
	public String getDetails() {
		return ("Roll: " + this.rollNo + "	  " + "Fname: " + this.firstName + "\tLname: " + this.lastName);
	}
	
	
	
	
	

}
