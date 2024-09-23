package com.deloitte.lab6.ex7;

//Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
import java.util.Arrays;

public class Lab6Ex7 {

    public static int[] getSorted(int[] arr) {
        // Convert numbers to strings
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        // Reverse strings
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = new StringBuilder(strArr[i]).reverse().toString();
        }

        // Convert strings back to integers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        // Sort the array
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {123, 456, 789};
        int[] sortedArr = getSorted(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}