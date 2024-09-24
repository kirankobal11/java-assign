package com.deloitte.lab4.ex3;
import java.util.*;
public abstract class MediaItem extends Item {
	private int runtime;
	
    public MediaItem(int identificationNumber, String title, int numberOfCopies) {
			super(identificationNumber, title, numberOfCopies);
		
	}
    Scanner sc=new Scanner(System.in);
    
    
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
			this.runtime = runtime;
	}
	
	
	
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
		System.out.println("Enter the runtime");
		this.runtime=sc.nextInt();
	}
	
	/**
	 * Overriding the abstract method to display user given inputs
	 */
	
	@Override
	public void printDetails() {
		System.out.println("Identification Number : "+getIdentificationNumber());
		System.out.println("Title : "+getTitle());
		System.out.println("Number of copies : "+getNumberOfCopies());
		System.out.println("Runtime : "+getRuntime());
	}
    
}