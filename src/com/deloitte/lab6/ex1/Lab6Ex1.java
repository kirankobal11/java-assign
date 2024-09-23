package com.deloitte.lab6.ex1;

//Create a method which accepts a hash map and return the values of the map in sorted order as a List.
import java.util.*;

public class Lab6Ex1 {

    public static List<Integer> getValues(HashMap<Integer, Integer> map) {//Integer> as input and returns a sorted List<Integer>.
        List<Integer> values = new ArrayList<>(map.values());//Creating List from Values
        Collections.sort(values);//Sorting the Values List
        return values;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 5);
        map.put(3, 20);

        List<Integer> sortedValues = getValues(map);
        System.out.println("Sorted values: " + sortedValues);
    }
}