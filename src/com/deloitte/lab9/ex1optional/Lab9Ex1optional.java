package com.deloitte.lab9.ex1optional;
//Write a lambda expression which accepts x and y numbers and return x**y.
import java.util.function.BiFunction;

public class Lab9Ex1optional {

    public static BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;

    public static void main(String[] args) {
        int result = multiply.apply(5, 3);
        System.out.println("Product: " + result);
    }
}