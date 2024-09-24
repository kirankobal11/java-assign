package com.deloitte.lab9.ex1;
import java.util.*;

import com.deloitte.lab9.ex1.AbsClass.Maths;

import java.math.*;

public class Lab9Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsClass.Maths obj =(int i ,int j) -> {return Math.pow(i, j); };
		System.out.println(obj.toThePower(2, 3));
	}

}