package com.deloitte.lab9.ex1optional;

import java.util.function.BiPredicate;

public class Person {
    public static BiPredicate<String, String> authenticate = (username, password) -> {
        // Replace this with your actual authentication logic
        if (username.equals("kiran") && password.equals("password123")) {
            return true;
        } else {
            return false;
        }
    };
}