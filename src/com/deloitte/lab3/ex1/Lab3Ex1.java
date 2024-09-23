package com.deloitte.lab3.ex1;
//Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
//(Use String Tokenizer class)?
import java.util.Scanner;
import java.util.StringTokenizer;// used to tokenize (split) the input string into individual integers.

public class Lab3Ex1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {//The try-ensures closing of scanner even if an exception occurs.
			System.out.print("Enter a line of integers: ");
			String input = scanner.nextLine();

			StringTokenizer tokenizer = new StringTokenizer(input);
			int sum = 0;

			while (tokenizer.hasMoreTokens()) {
			    String token = tokenizer.nextToken();//This line retrieves the next integer from the tokenizer.
			    int number = Integer.parseInt(token);//This line converts the String token (token) into an integer value using Integer.parseInt.
			    System.out.println(number);
			    sum += number;
			}

			System.out.println("Sum of all integers: " + sum);
		} catch (NumberFormatException e) {//if the user enters a non-numeric value within the line of integers.
			e.printStackTrace();
		}
    }
}
