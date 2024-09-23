package com.deloitte.lab5.ex2;

//Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.
import java.util.Scanner;

class InvalidNameException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message) {
        super(message);
    }
}

public class Lab5Ex2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your first name: ");
			String firstName = scanner.nextLine();

			System.out.print("Enter your last name: ");
			String lastName = scanner.nextLine();

			try {
			    validateName(firstName, lastName);//This method takes two String arguments, firstName and lastName, and throws an InvalidNameException if either name is blank
			    System.out.println("Valid full name!");
			} catch (InvalidNameException e) {
			    System.out.println(e.getMessage());
			}
		}
    }

    public static void validateName(String firstName, String lastName) throws InvalidNameException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Invalid name: First and last names cannot be blank.");
        }
    }
}