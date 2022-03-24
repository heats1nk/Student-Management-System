package com.studentmgmt.org;

public class Student {

	private String firstName;
	private String lastName;
	private int rollNo;
	
	public Student() {}
	

	public Student(int rollNo, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;

	}
	
	//--SETTERS--

	public void setName(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}

	public void setRoll(int rollno) {
		this.rollNo = rollno;
	}
	
	public void setDetails(int rollNo, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}
	
	
	
	//--GETTERS--
	public String getName() {
		return ("Fname: " + this.firstName + "\tLname: " + this.lastName);
	}
	
	public int getRoll() {
		return this.rollNo;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this .lastName;
	}
	
	public String getDetails() {
		return (this.rollNo + "\t" + this.firstName + "\t\t " + this.lastName);
	}

}
