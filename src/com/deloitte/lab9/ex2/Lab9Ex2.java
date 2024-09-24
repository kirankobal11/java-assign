package com.deloitte.lab9.ex2;
import java.util.*;


public class Lab9Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string without space: ");
		String str = scan.next();
		
		AddSpace as = (abc) -> {
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<abc.length();i++) {
					sb.append(abc.charAt(i)+" ");
				}
				
				String res = sb.toString();
				return res;
			};
			
			System.out.println("New string is: "+as.space(str));

	}
}