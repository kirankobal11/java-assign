package com.deloitte.lab3.ex4;

//Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number 
//is equal to the difference between two consecutive digits in the original number. 
//The digit in the units place can be left as it is. 
//Note: Take the absolute value of the difference. Ex: 6-8 = 2

public class Lab3Ex4 {

    public int modifyNumber(int number) {
        String strNumber = String.valueOf(number); //Converting to String
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 1; i < strNumber.length(); i++) { //Extracting Digits
            int prevDigit = Character.getNumericValue(strNumber.charAt(i - 1));
            int currentDigit = Character.getNumericValue(strNumber.charAt(i));
            int difference = Math.abs(prevDigit - currentDigit);//Calculating Difference
            resultBuilder.append(difference);//appends the calculated difference (difference)
        }

        resultBuilder.append(strNumber.charAt(strNumber.length() - 1)); // Add the last digit

        return Integer.parseInt(resultBuilder.toString());//Converting Back and Returning
    }

    public static void main(String[] args) {
        Lab3Ex4 modifier = new Lab3Ex4();
        int number = 45862;
        int modifiedNumber = modifier.modifyNumber(number);
        System.out.println(modifiedNumber);
    }
}
