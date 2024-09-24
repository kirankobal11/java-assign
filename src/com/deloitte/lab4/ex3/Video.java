package com.deloitte.lab4.ex3;
import java.util.Scanner;
public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int yearReleased;
	
	public Video(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	Scanner sc=new Scanner(System.in);
	

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	/**
     *  Overriding the method of its super class mediaItem to get user input.
     *  Adding additional information into the overridden method.
     */
	
	@Override
	public void addDetails() {
		super.addDetails();
		System.out.println("Enter the director name");
		this.director=sc.next();
		System.out.println("Enter the genre");
		this.genre=sc.next();
		System.out.println("Enter the released year");
		this.yearReleased=sc.nextInt();
	}
	
	/**
	 * Overriding the abstract method to display user given inputs
	 */
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Director : "+getDirector());
		System.out.println("Genre : "+getGenre());
		System.out.println("Released year : "+getYearReleased());
	}
    
}