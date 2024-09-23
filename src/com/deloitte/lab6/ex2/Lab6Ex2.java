package com.deloitte.lab6.ex2;

//Create a method that accepts a character array and count the number of times each character is present in the array.
import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : arr) {//Iterating and Counting Characters
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'b'};

        Map<Character, Integer> countMap = countChars(arr);
        System.out.println(countMap);
    }
}