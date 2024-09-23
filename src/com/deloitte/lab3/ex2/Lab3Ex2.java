package com.deloitte.lab3.ex2;

//Create a class containing a method to create the mirror image of a String. 
//The method should return the two Strings separated with a pipe(|) symbol .

public class Lab3Ex2 {

    public String getImage(String str) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        // reverses the characters using the reverse method of StringBuilder
        return str + "|" + reversedStr;
    }

    public static void main(String[] args) {
    	Lab3Ex2 mirror = new Lab3Ex2();
        String input = "EARTH";
        String output = mirror.getImage(input);
        System.out.println(output);
    }
}