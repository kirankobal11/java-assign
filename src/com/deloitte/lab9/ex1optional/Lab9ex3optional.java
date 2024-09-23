package com.deloitte.lab9.ex1optional;

import java.util.function.BiPredicate;

public class Lab9ex3optional {
    public static BiPredicate<String, String> authenticateUser = (username, password) -> {
        // Replace with your actual authentication logic
        if (username.equals("admin") && password.equals("password123")) {
            return true;
        } else {
            return false;
        }
    };

    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        boolean isAuthenticated = authenticateUser.test(username, password);
        System.out.println("Authentication result: " + isAuthenticated);
    }
}