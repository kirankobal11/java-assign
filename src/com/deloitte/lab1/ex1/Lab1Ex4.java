package com.deloitte.lab1.ex1;
//Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

import java.util.Scanner;

public class Lab1Ex4 {

    public static boolean isPrime(int number) {
        if (number <= 1) {//Numbers less than or equal to 1 are not prime.
            return false;
        }
        if (number <= 3) { 
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {//check Divisibility
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {//all odd divisors are considered
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}