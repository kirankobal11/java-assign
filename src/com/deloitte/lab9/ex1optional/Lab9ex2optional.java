package com.deloitte.lab9.ex1optional;

import java.util.stream.Collectors;

public class Lab9ex2optional {
    public static String formatString(String str) {
        return str.chars()
                 .mapToObj(c -> (char) c)
                 .map(String::valueOf)
                 .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String input = "CG";
        String formattedString = formatString(input);
        System.out.println("Formatted string: " + formattedString);
    }
}
