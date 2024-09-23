package com.deloitte.lab3.ex8;

//Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.
public class Lab3Ex8 {

    public boolean isPositiveString(String str) {
        if (str.length() <= 1) {
            return true; // Single-character or empty strings are considered positive
        }

        char prevChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar <= prevChar) {//using ASCII value comparison
                return false;
            }
            prevChar = currentChar;//updates prevChar with the current character for the next iteration.
        }

        return true;
    }

    public static void main(String[] args) {
        Lab3Ex8 checker = new Lab3Ex8();
        String str1 = "ANT";
        String str2 = "BAT";
        String str3 = "CAT";
        String str4 = "ZAB";

        System.out.println(str1 + " is positive: " + checker.isPositiveString(str1));
        System.out.println(str2 + " is positive: " + checker.isPositiveString(str2));
        System.out.println(str3 + " is positive: " + checker.isPositiveString(str3));
        System.out.println(str4 + " is positive: " + checker.isPositiveString(str4));
    }
}
