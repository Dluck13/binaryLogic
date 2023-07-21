package acoountAbstraction;

import abstraction2.Calculator;
import abstraction2.DigitalCalc;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BankApp {

    public static void main(String[] args) {
        Savings savings = new Savings(1500.00);
        Checking checking = new Checking(2000.00);
        System.out.println(checking.balance);
        System.out.println(savings.balance);
        checking.deposit(500);
        System.out.println(checking.balance);
        checking.withdraw(2700.00);
        System.out.println(checking.balance);
        savings.withdraw(1600.00);
        Account[] accounts = new Account[2];
        accounts[0]= checking;
        accounts[1]= savings;
        System.out.println(Arrays.stream(accounts).distinct().collect(Collectors.toList()));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(accounts[0].balance);
        System.out.println(accounts[1].balance);
        System.out.println("++++++++++++++++++++++++++++");
        for (int i = 0; i <accounts.length ; i++) {

            System.out.println(accounts[i]);
        }
        DigitalCalc dc = new DigitalCalc();
       double res = dc.add(5,5);
       double res1 = dc.minus(5,5);
        double res2 = dc.product(5,5);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);





    }
}
