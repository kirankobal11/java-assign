package com.deloitte.lab9.ex2;

//You are asked to create an application for registering the details of jobseeker. The requirement is:
//Username should always end with _job and there should be at least minimum of 8 characters to the left of _job. Write a function to validate the same. Return true in case the validation is passed. In case of validation failure return false.

public class JobseekerRegistration {

    public static void main(String[] args) {
        String username1 = "john_doe_job";
        String username2 = "jane";

        boolean isValid1 = JobseekerValidator.validateUsername(username1);
        boolean isValid2 = JobseekerValidator.validateUsername(username2);

        System.out.println("Username '" + username1 + "' is valid: " + isValid1);
        System.out.println("Username '" + username2 + "' is valid: " + isValid2);
    }
    public class JobseekerValidator {
        public static boolean validateUsername(String username) {
            if (username.endsWith("_job") && username.length() > 8) {
                return true;
            } else {
                return false;
            }
        }
    }
}