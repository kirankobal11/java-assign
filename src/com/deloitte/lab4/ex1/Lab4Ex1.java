package com.deloitte.lab4.ex1;


import java.util.Scanner;

class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }
}

class Account {
    private static long nextAccNum = 1000;
    private long accNum;
    protected double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = nextAccNum++;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Minimum balance of INR 500 must be maintained.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public Person getAccHolder() {
        return accHolder;
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Savings Account requires a minimum balance of INR 500.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
        super(accHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Overdraft limit reached.");
        }
    }
}

public class Lab4Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for smith account:");
        System.out.print("Name: ");
        String smithName = scanner.nextLine();
        System.out.print("Age: ");
        float smithAge = scanner.nextFloat();
        System.out.print("Initial Balance: ");
        double smithInitialBalance = scanner.nextDouble();

        Person smith = new Person(smithName, smithAge);
        Account smithAcc = new SavingsAccount(smith, smithInitialBalance);

        System.out.println("Enter details for Kathy account:");
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String KathyName = scanner.nextLine();
        System.out.print("Age: ");
        float KathyAge = scanner.nextFloat();
        System.out.print("Initial Balance: ");
        double KathyInitialBalance = scanner.nextDouble();
        System.out.print("Overdraft Limit: ");
        double overdraftLimit = scanner.nextDouble();

        Person Kathy = new Person(KathyName, KathyAge);
        Account KathyAcc = new CurrentAccount(Kathy, KathyInitialBalance, overdraftLimit);

        System.out.print("Enter deposit amount for smith: ");
        double smithDeposit = scanner.nextDouble();
        alexAcc.deposit(smithDeposit);
        System.out.println("smith account balance: " + smithAcc.getBalance());

        System.out.print("Enter withdrawal amount for Kathy: ");
        double KathyWithdraw = scanner.nextDouble();
        KathyAcc.withdraw(KathyWithdraw);
        System.out.println("Kathy account balance: " + KathyAcc.getBalance());

        scanner.close();
    }
}
