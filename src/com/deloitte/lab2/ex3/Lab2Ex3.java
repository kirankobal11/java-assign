package com.deloitte.lab2.ex3;

//Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
import java.util.Arrays;

public class Lab2Ex3 {

    public int[] getSorted(int[] arr) {
        String[] strArr = new String[arr.length];//Creates a new String array strArr with the same size as the input integer array arr
        for (int i = 0; i < arr.length; i++) {//This loop iterates through each element (i) in the integer array arr.
            strArr[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(strArr);//sort method from the Arrays class to sort the elements in the strArr

        for (int i = 0; i < arr.length; i++) {//creates a StringBuilder object from the current string (strArr[i]), reverses the characters (digits) using the reverse method, and converts it back to a String using toString


            arr[i] = Integer.parseInt(new StringBuilder(strArr[i]).reverse().toString());//This parses the reversed string back into an integer and assigns it to the corresponding element (arr[i]) in the original integer array arr.
        }

        Arrays.sort(arr);//sorts the integer array arr again, which now contains the reversed digits of the original numbers

        return arr;
    }

    public static void main(String[] args) {
        Lab2Ex3 reverserSorter = new Lab2Ex3();
        int[] arr = {123, 456, 789};
        int[] sortedArr = reverserSorter.getSorted(arr);
        for (int num : sortedArr) {
            System.out.println(num);
        }
    }
}
