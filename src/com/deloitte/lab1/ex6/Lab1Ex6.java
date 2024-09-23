package com.deloitte.lab1.ex6;

//Create a class with a method to find the difference between the sum of the squares 
//and the square of the sum of the first n natural numbers.
public class Lab1Ex6 {

    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int squareOfSum = 0;

        for (int i = 1; i <= n; i++) {//calculate the sum of squares and square of the sum.
            sumOfSquares += i * i;//Squares the current number i and adds it to sumOfSquares.
            squareOfSum += i;//Adds the current number i to squareOfSum.
        }

        squareOfSum *= squareOfSum;//squareOfSum = squareOfSum * squareOfSum;

        return sumOfSquares - squareOfSum;//difference
    }

    public static void main(String[] args) {
        Lab1Ex6 calculator = new Lab1Ex6();
        int n = 15;
        int difference = calculator.calculateDifference(n);//calling the method
        System.out.println("The difference between the sum of squares and the square of the sum of the first " + n + " natural numbers is: " + difference);
    }
}