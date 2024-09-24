package com.deloitte.lab1.ex2;

//Exercise 2: Write a java program that simulates a traffic light. The program lets the user select one of three lights
//: red, yellow, or green with int inputs. 
//On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console. 


import java.util.Scanner;

public class Lab1Ex2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("Select a traffic light:");
			    System.out.println("1. Red");
			    System.out.println("2. Yellow");
			    System.out.println("3. Green");
			    System.out.print("Enter your choice (1-3): ");

			    int choice = scanner.nextInt();

			    switch (choice) {
			        case 1:
			            System.out.println("Stop");
			            break;
			        case 2:
			            System.out.println("Ready");
			            break;
			        case 3:
			            System.out.println("Go");
			            break;
			        default:
			            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
			    }
			}
		}
    }
}