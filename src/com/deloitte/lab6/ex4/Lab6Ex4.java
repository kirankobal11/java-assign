package com.deloitte.lab6.ex4;

//school offers medals to the students of tenth based on the following criteria 
//If(Marks>=90) : Gold 
//If(Marks between 80 and 90) : Silver 
//If(Marks between 70 and 80) : Bronze 
//Note: Marks between 80 and 90 means marks>=80 and marks<90 

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

    public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marksMap) {
        HashMap<Integer, String> medalMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {
            int registrationNumber = entry.getKey();
            int marks = entry.getValue();

            String medal = "";
            if (marks >= 90) {
                medal = "Gold";
            } else if (marks >= 80) {
                medal = "Silver";
            } else if (marks >= 70) {
                medal = "Bronze";
            }

            if (!medal.isEmpty()) {
                medalMap.put(registrationNumber, medal);
            }
        }

        return medalMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> marksMap = new HashMap<>();
        marksMap.put(101, 95);
        marksMap.put(102, 85);
        marksMap.put(103, 75);
        marksMap.put(104, 65);

        HashMap<Integer, String> medalMap = getStudents(marksMap);
        System.out.println(medalMap);
    }
}
