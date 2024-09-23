package com.deloitte.lab6.ex3;
//Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] arr) {
        Map<Integer, Integer> squaresMap = new HashMap<>();//Creating Squares Map

        //Iterating and Calculating Squares
        for (int num : arr) {
            squaresMap.put(num, num * num);
        }

        return squaresMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Map<Integer, Integer> squaresMap = getSquares(arr);
        System.out.println(squaresMap);
    }
}