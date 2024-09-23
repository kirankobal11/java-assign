package com.deloitte.lab5.ex1;

//Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
import java.util.Scanner;

class InvalidAgeException extends Exception {//Custom Exception Class
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {//automatically close the Scanner object after the code within the block finishes execution
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();

			//Validation with try-catch
			try {
			    validateAge(age);
			    System.out.println("Valid age!");
			} catch (InvalidAgeException e) {
			    System.out.println(e.getMessage());
			}
		}
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 15) {
            throw new InvalidAgeException("Invalid age: Age must be greater than or equal to 15.");
        }
    }
}
