package com.deloitte.lab1.ex7;

// Create a method to check if a number is an increasing number


public class Lab1Ex7 {

    public boolean checkNumber(int number) {
        int previousDigit = number % 10;//Extracts the last digit of the number and stores it in previousDigit
        number /= 10;// remove the last digit from the original number.

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit > previousDigit) {//If true, it violates the increasing order and the method returns false.
                return false;
            }
            previousDigit = currentDigit;//previousDigit with the current digit for the next comparison.
            number /= 10;//number /= 10;: Removes the current last digit from number for the next iteration.
        }

        return true;
    }

    public static void main(String[] args) {
        Lab1Ex7 checker = new Lab1Ex7();
        int number = 12248;
        boolean isIncreasing = checker.checkNumber(number);
        System.out.println("The number " + number + " is increasing: " + isIncreasing);
    }
}
