package com.deloitte.lab1.ex1;
//Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

public class Lab1Ex5 {

    public int calculateSum(int n) {
        int sum = 0;//Initializes a variable sum

        for (int i = 1; i <= n; i++) { //check each natural number.
            if (i % 3 == 0 || i % 5 == 0) {//checks divisible by 3 or 5  
                sum += i;//condition is true, the current number i is added to the sum
            }
        }

        return sum;//sum of divisible numbers is returned.
    }

    public static void main(String[] args) {//entry point of the program
    	Lab1Ex5 calculator = new Lab1Ex5();
        int n = 100; // sample
        int result = calculator.calculateSum(n);// Calls method 
        System.out.println("Sum of first " + n + " natural numbers divisible by 3 or 5: " + result);
    }
}
