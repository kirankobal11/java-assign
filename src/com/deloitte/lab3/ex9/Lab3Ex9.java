package com.deloitte.lab3.ex9;
//Create a method to accept date and print the duration in days, months and years with regards to current system date.
import java.time.LocalDate;
import java.time.Period;

public class Lab3Ex9 {

    public void calculateDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();//Getting Current Date
        Period period = Period.between(inputDate, currentDate);//Calculating Period
        //Extracting and Printing Components
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");
    }

    public static void main(String[] args) {
        Lab3Ex9 calculator = new Lab3Ex9();

        // Example usage:
        LocalDate inputDate = LocalDate.of(2023, 1, 1);
        calculator.calculateDuration(inputDate);
    }
}
