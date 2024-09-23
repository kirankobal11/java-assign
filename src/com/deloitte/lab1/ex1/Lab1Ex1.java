package com.deloitte.lab1.ex1;

import java.util.Scanner;
//Exercise 1: Create a method to 
//find the sum of the cubes of the digits of 
//an n digit number
public class Lab1Ex1 {

    public static int calculateCubeSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter an n-digit number: ");
			int number = scanner.nextInt();

			int cubeSum = calculateCubeSum(number);
			System.out.println("The sum of the cubes of the digits is: " + cubeSum);
		}
    }
}
