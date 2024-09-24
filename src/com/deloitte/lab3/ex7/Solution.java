package com.deloitte.lab3.ex7;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Solution {
	public static void printDuration(LocalDate date) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(date, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");
    }
	
}