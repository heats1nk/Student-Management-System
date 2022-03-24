package com.studentmgmt.org;

import java.util.Scanner;

public class UserInput {

	public void start() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nEnter the choice: \n1. View records \n2. Enter a record \n3. Delete a record \n0. Quit");
			String input = scanner.nextLine();
			StudentDAO dao = new StudentDAO();

			switch (input) {
			case "1":
				System.out.println("You entered 1");
				System.out.println();
				// --Student DAO--

				// Student object = dao.getTable();
				dao.connect();
				dao.getTable();
				break;
				

			case "2":
				System.out.println("Enter the rollno, First Name and Last Name.");
				System.out.println();
				//connection code
				
				
				System.out.println("Enter roll number: ");
				int rollno = Integer.valueOf(scanner.nextLine());
				
				System.out.println("Enter first name: ");
				String firstName = scanner.nextLine();
				
				System.out.println("Enter last name: ");
				String lastName = scanner.nextLine();
				
				//constructor
				Student inputStudentData = new Student(rollno, firstName, lastName);
				dao.connect();
				dao.addStudent(inputStudentData);
				

				break;
				
				
			case "3":
				System.out.println("Enter roll no. of record to be deleted");
				int inputRoll = Integer.valueOf(scanner.nextLine());
				dao.connect();
				dao.deleteStudent(inputRoll);
				
				
				break;
			case "0":
				scanner.close();
				System.out.println("Quitting...");
				System.exit(0);

			default:
				System.out.println("Invalid input");
			}

		}
	}

}
