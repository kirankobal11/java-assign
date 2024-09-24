package com.deloitte.lab4.ex3;

import java.util.Scanner;
public abstract class WrittenItem extends Item{
	
    private String author;
	
	public WrittenItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	Scanner sc=new Scanner(System.in);
	    
    
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Overriding the abstract method to get details from the user
	 */
	
	@Override
	public void addDetails() {
		System.out.println("Enter the identification number");
		int idNum=sc.nextInt();
		setIdentificationNumber(idNum);
		System.out.println("Enter the title");
		String title=sc.next();
		setTitle(title);
		System.out.println("Enter the number of copies");
		int numOfCopies=sc.nextInt();
		setNumberOfCopies(numOfCopies);
		System.out.println("Enter the author name");
		this.author=sc.next();
	}
	
	/**
	 * Overriding the abstract method to display user given inputs
	 */
	
	@Override
	public void printDetails() {
		System.out.println("Identification Number : "+getIdentificationNumber());
		System.out.println("Title : "+getTitle());
		System.out.println("Number of copies : "+getNumberOfCopies());
		System.out.println("Author : "+getAuthor());
	}
	
}