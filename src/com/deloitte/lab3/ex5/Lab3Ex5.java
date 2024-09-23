package com.deloitte.lab3.ex5;
//Write a Java program that displays the number of characters, lines and words in a text? 
import java.io.BufferedReader;//or reading text from a file line by line.
import java.io.FileReader;//to create a file reader object for the specified file path.
import java.io.IOException;//potential exceptions during file operations.

public class Lab3Ex5 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\download\\Deloitte docs\\Traning\\kiran-core-java-labs\\src\\com\\deloitte\\lab1\\ex1.txt"))) {
            //Reading Lines and Counting
        	
        	String line;
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += getWordCount(line);
            }

            System.out.println("Character count: " + charCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);
        } catch (IOException e) {//handles potential IOException exceptions that might occur during file operations.
            e.printStackTrace();
            System.out.println(System.getProperty("user.dir"));
        }
    }

    private static int getWordCount(String line) {
        String[] words = line.trim().split("\\s+");//Trimming and Splitting
        return words.length;
    }
}