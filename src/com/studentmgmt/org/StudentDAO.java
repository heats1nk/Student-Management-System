package com.studentmgmt.org;
import java.sql.*;

public class StudentDAO {
	private String url = "jdbc:mysql://localhost:3306/test_db";
	private String uname = "root";
	private String pass = "admin";
	String query = "Select * from students";
	
	
	//this method is responsible for db connection and fetching student records
	public Student getAllStudent(){
		try {
			Student student = new Student();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, uname, pass);
			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(query);
			
			/*
			 * rs.next(); String firstname = rs.getString("firstname"); String lastname =
			 * rs.getString("lastname"); student.setName(firstname, lastname); return
			 * student;
			 */
			
			rs.afterLast();
			System.out.println("Contents of table: ");
			while(rs.previous()) {
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				student.setName(firstname, lastname);
				return student;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public void getTable(){
		try {
			Student student = new Student();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, uname, pass);
			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(query);
			
			System.out.println("Contents of table: ");
			while(rs.next()) {
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int roll = rs.getInt("rollno");
				student.setDetails(roll, firstname, lastname);
				System.out.println(student.getDetails());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
