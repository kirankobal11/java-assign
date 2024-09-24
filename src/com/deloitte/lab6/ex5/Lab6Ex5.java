package com.deloitte.lab6.ex5;
import java.util.*;

public class Lab6Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = sc.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[number];
		
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		
		GetSecondSmallest gss = new GetSecondSmallest();
		int secondSmallest = GetSecondSmallest.getSecondSmallest(arr); // Function Call
		System.out.println(secondSmallest); 
	}

}