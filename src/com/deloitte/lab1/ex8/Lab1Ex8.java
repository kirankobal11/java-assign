package com.deloitte.lab1.ex8;

//Create a method to check if a number is a power of two or not
public class Lab1Ex8 {

    public boolean checkNumber(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {//n is not divisible by 2 (leaves a remainder)
                return false;
            }
            n /= 2;//effectively removing the least significant bit (rightmost bit)
        }//A power of 2 has only one bit set to 1. The rest of the bits are 0.
        //For example, 4 in binary is 100.

        return true;
    }

    public static void main(String[] args) {
        Lab1Ex8 checker = new Lab1Ex8();
        int n = 16;
        boolean isPowerOfTwo = checker.checkNumber(n);
        System.out.println("The number " + n + " is a power of 2: " + isPowerOfTwo);
    }
}