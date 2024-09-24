package com.deloitte.lab3.ex6;
import java.util.*;

public class Lab3Ex6 {
	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your strinig");
		str=sc.nextLine();
		
		Solution s = new Solution();
        boolean isPositive = s.isPositiveString(str);

        if (isPositive) {
            System.out.println(str + " is a positive string.");
        } else {
            System.out.println(str + " is not a positive string.");
        }
	}
}