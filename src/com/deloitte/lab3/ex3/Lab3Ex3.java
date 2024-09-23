package com.deloitte.lab3.ex3;
//Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
//Note: Consonant refers to all alphabets excluding vowels
public class Lab3Ex3 {

    public String alterString(String str) {
        char[] charArray = str.toCharArray();//Converting to Character Array

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];//converts the input string str into a character array charArray


            if (isConsonant(currentChar)) {//checks current character is a consonant using the isConsonant method
                charArray[i] = (char) (currentChar + 1);//adding 1 to its ASCII value and casting it back to a character.
            }
        }

        return new String(charArray);//modified character array charArray and returns it.
    }

    private boolean isConsonant(char c) {// It calls the isVowel method for the check.
        return !isVowel(c);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Lab3Ex3 replacer = new Lab3Ex3();
        String input = "JAVA";
        String output = replacer.alterString(input);
        System.out.println(output);
    }
}