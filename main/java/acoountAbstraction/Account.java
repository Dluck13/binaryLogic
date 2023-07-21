package acoountAbstraction;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);



    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
