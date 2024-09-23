package com.deloitte.lab6.ex6;

//Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. A person is eligible for vote if his age is greater than 18. Add the IDs of all the eligible persons to list and return the list. 
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Lab6Ex6 {

    public static List<Integer> votersList(Map<Integer, LocalDate> ageMap) {
        List<Integer> eligibleVoters = new ArrayList<>();

        for (Map.Entry<Integer, LocalDate> entry : ageMap.entrySet()) {
            int id = entry.getKey();
            LocalDate dob = entry.getValue();

            int age = Period.between(dob, LocalDate.now()).getYears();
            if (age >= 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<Integer, LocalDate> ageMap = new HashMap<>();
        ageMap.put(101, LocalDate.of(2000, 1, 1));
        ageMap.put(102, LocalDate.of(2005, 1, 1));
        ageMap.put(103, LocalDate.of(1995, 1, 1));

        List<Integer> eligibleVoters = votersList(ageMap);
        System.out.println("Eligible voters: " + eligibleVoters);
    }
}
