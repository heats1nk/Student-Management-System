package com.studentmgmt.org;

import java.util.Scanner;

public class UserInput {
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter the choice: \n1. View records \n0. Quit");
			String input = scanner.nextLine();
		
			switch(input) {
			case "1":
				System.out.println("\nYou entered 1");
				System.out.println();
				break;
				
			case "0":
				System.exit(0);
				
			default:
				System.out.println("Invalid input");
			}
			
		}
	}

}
