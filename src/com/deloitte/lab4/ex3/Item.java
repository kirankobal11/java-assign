package com.deloitte.lab4.ex3;

public abstract class Item {
	
	private String title;
	private int numberOfCopies;
	private int identificationNumber;
	
	//absttract mrthods
	public abstract void addDetails();    
	public abstract void printDetails();
    
	//constructor
	public Item(int identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	

	public int getIdentificationNumber() {
		return identificationNumber;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOCopies) {
		this.numberOfCopies = numberOCopies;
	}
	
	
	public String getTitle() {
		return title;
		
	}

}