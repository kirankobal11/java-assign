package com.deloitte.lab2.ex1;
//Create a method which accepts an array of integer elements and return the second smallest element in the array
import java.util.Arrays;

public class Lab2Ex1 {

    public int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);//sort the elements in the array arr in ascending order.
        return arr[1];//second smallest element will be at index 1
    }

    public static void main(String[] args) {
        Lab2Ex1 finder = new Lab2Ex1();
        int[] arr = {5, 2, 8, 1, 3};
        int secondSmallest = finder.getSecondSmallest(arr);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }
}
