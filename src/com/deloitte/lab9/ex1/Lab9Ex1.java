package com.deloitte.lab9.ex1;

import java.util.concurrent.*;

public class Lab9Ex1 {
    public static void main(String[] args) {
        // Create a fixed thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Create tasks
        Runnable task1 = () -> {
            System.out.println("Task 1 started");
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 finished");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 started");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 finished");
        };

        // Submit tasks to the executor service
        executorService.submit(task1);
        executorService.submit(task2);

        // Wait for tasks to complete
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed");
    }
}