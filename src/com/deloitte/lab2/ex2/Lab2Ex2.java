package com.deloitte.lab2.ex2;

// Create a method that can accept an array of String objects and sort in alphabetical order. 
//The elements in the left half should be completely in uppercase and the elements in the right 
//half should be completely in lower case. Return the resulting array.
//Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

import java.util.Arrays;

public class Lab2Ex2 {

    public String[] sortStrings(String[] arr) {//String array arr as input and returns a new String array with elements sorted and the first half capitalized.
        Arrays.sort(arr);
        int mid = arr.length / 2;//his calculates the middle index of the array.

        for (int i = 0; i < mid; i++) {//This loop iterates from the beginning (i = 0) to the middle index 
            arr[i] = arr[i].toUpperCase();// converted to uppercase using the toUpperCase method.
        }

        for (int i = mid; i < arr.length; i++) {//This loop iterates from the middle index (i = mid) to the end of the array (i < arr.length)
            arr[i] = arr[i].toLowerCase();//each element is converted to lowercase using the toLowerCase method.
        }

        return arr;//returns the modified array
    }

    public static void main(String[] args) {
        Lab2Ex2 sorter = new Lab2Ex2();
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] sortedArr = sorter.sortStrings(arr);//Calling the Method
        for (String str : sortedArr) {
            System.out.println(str);
        }
    }
}
