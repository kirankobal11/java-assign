package com.deloitte.lab3.ex7;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Lab3Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate,formatter);
        
        Solution s = new Solution();

        s.printDuration(date);
	}

}