package com.deloitte.lab1.ex3;

//Exercise 3: The Fibonacci sequence is defined by the following rule. 
//The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it.
//Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?

import java.util.Scanner;

public class Lab1Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Recursive approach
        int recursiveFibonacci = fibonacciRecursive(n);
        System.out.println("Recursive Fibonacci: " + recursiveFibonacci);

        // Non-recursive approach
        int nonRecursiveFibonacci = fibonacciNonRecursive(n);
        System.out.println("Non-Recursive Fibonacci: " + nonRecursiveFibonacci);

        scanner.close();
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static int fibonacciNonRecursive(int n) {
        if (n <= 2) {
            return 1;
        }

        int fib1 = 1;//Initializes two variables, fib1 and fib2,
        //to store the previous two Fibonacci numbers (1 and 1).
        int fib2 = 1;
        int fib = 0;//Initializes fib to store the current Fibonacci number being calculated.


        for (int i = 3; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }
}