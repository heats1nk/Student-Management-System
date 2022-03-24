package com.studentmgmt.org;

import java.sql.*;

public class StudentDAO {
	private String url = "jdbc:mysql://localhost:3306/test_db";
	private String uname = "root";
	private String pass = "root";

	Connection conn = null;

	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname, pass);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	//--this method is responsible for db connection and fetching student records
	public void getTable() {
		String query = "Select * from students";
		try {
			Student student = new Student();
			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(query);
			System.out.println("Contents of table: ");
			System.out.println("-------------------------------------");
			System.out.println("Roll" + "\tFirst Name" + "\tLastName");
			System.out.println("-------------------------------------");
			while (rs.next()) {
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int roll = rs.getInt("rollno");
				student.setDetails(roll, firstname, lastname);
				System.out.println(student.getDetails());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	//--Method to add students to database
	public void addStudent(Student s) {
		Student student = s;
		String query = "Insert into students VALUES (?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, student.getRoll());
			pstmt.setString(2, student.getFirstName());
			pstmt.setString(3, student.getLastName());
			int rowAffected = pstmt.executeUpdate();
			System.out.println(rowAffected + " rows affected.");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
