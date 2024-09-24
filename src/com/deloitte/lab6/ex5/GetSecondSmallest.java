package com.deloitte.lab6.ex5;
import java.util.*;

public class GetSecondSmallest {
	public static int getSecondSmallest(int[] array) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		
		Collections.sort(list);
		int secondSmallest = list.get(1); 
		return secondSmallest;
	}
}