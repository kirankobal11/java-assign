package com.deloitte.lab5.ex3;
import java.util.*;

public class Lab5Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Get the salary as input
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		// check the salary is valid or not in try block
		
		ValidateSalary vs = new ValidateSalary();
		
		ValidateSalary.checkSalary(salary);
		sc.close();
	}
}