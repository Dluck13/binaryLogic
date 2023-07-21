package practice;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        switch (val){
                case 1:
                System.out.println("Today is Monday");
                break;
                case 2:
                System.out.println("Today is Tues");
                break;
                case 3:
                System.out.println("Today is Weds");
                break;
                case 4:
                System.out.println("Today is Thurs");
                break;
                case 5:
                System.out.println("Today is Fri");
                break;
                case 6:
                System.out.println("Today is Sat");
                break;
                case 7:
                System.out.println("Today is Sun");
                break;
                default:
                System.out.println("Invalid number");
                    System.out.println(val);

        }






    }
}
