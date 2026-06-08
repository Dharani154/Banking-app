package com.bank;

public class BankingApplication {

    public static void main(String[] args) {

        double balance = 10000;

        balance = deposit(balance,10000);

        balance = withdraw(balance,2000);

        System.out.println("Current Balance: " + balance);
    }

    public static double deposit(double balance,double amount){
        return balance + amount;
    }

    public static double withdraw(double balance,double amount){
        return balance - amount;
    }
}