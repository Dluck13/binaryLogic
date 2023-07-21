package acoountAbstraction;

public class Checking extends Account{


    public Checking(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;

    }

    @Override
    public void withdraw(double amount) {
        double overdraftLimit = -100.0;

        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            System.out.println("Your balance now is "+ balance);
        } else {
            System.out.println("Insufficient funds in checking account, your balance is "+ balance);
        }
    }

    @Override
    public String toString() {
        return "Checking{" +
                "balance=" + balance +
                '}';
    }
}

