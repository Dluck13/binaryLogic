package acoountAbstraction;

import acoountAbstraction.Account;

public class Savings extends Account {


    public Savings(double balance) {
        super(balance);
    }




    @Override
    public void deposit(double amount) {
        balance = balance + amount;

    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Your balance now is "+ balance);
        } else {
            System.out.println("Insufficient funds in savings account, your balance is "+ balance);
        }
    }

    @Override
    public String toString() {
        return "Savings{" +
                "balance=" + balance +
                '}';
    }
}

