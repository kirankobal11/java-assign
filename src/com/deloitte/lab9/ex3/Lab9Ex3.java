package com.deloitte.lab9.ex3;
import java.util.*;
import java.util.function.Predicate;


public class Lab9Ex3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email: ");
		String email=sc.next();
		System.out.println("Enter password: ");
		String pwd=sc.next();
		Predicate<String> predicateEmail=str->
		str.matches("^[a-zA-Z0-9._+]{3,}[a-zA-Z0-9]{0,}@[a-z]{2,}\\.(.+)$");
		
		Predicate<String> predicatePassword=str->str.matches("[a-zA-Z0-9._\\*\\$@+]{5,}");
		
		System.out.println(predicateEmail.test(email));
		System.out.println(predicatePassword.test(pwd));
		}
}