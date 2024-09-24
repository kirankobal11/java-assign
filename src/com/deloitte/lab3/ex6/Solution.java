package com.deloitte.lab3.ex6;
import java.util.*;

public class Solution {
	public  boolean isPositiveString(String str) {
        char prevChar = Character.MIN_VALUE;

        for (char c : str.toCharArray()) {
            if (c <= prevChar) {
                return false;
            }
            prevChar = c;
        }

        return true;
    }
}