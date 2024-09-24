package com.deloitte.lab4.ex3;

import java.util.*;
public class CD extends MediaItem{
	
	
	public CD(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	private String artist;
	private String genre;
	Scanner sc=new Scanner(System.in);
	
	
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
     *  Overriding the method of its super class mediaItem to get user input.
     *  Adding additional information into the overridden method.
     */
	
	@Override
	public void addDetails() {
		super.addDetails();
		System.out.println("Enter the artist name");
		this.artist=sc.next();
		System.out.println("Enter the genre");
		this.genre=sc.next();
	}
	
	/**
	 * Overriding the abstract method to display user given inputs
	 */
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Artist : "+getArtist());
		System.out.println("Genre : "+getGenre());
	}
	
	
	

}