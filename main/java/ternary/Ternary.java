package ternary;

import java.util.Collection;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ternary {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//       int b = scan.nextInt();
//        String output = (a%b==0)?"Even":"Odd";
//
//        int count = 0;
//        for (int i = 0; i <51 ; i++) {
//            count++;
//            if(count%5==0){
//                System.out.println(count);
//            };


//            for (int j = 0; j <101 ; j++) {
//                if(j%15==0){
//                    System.out.println("fizzbuzz");
//                }else if (j%3==0){
//                    System.out.println("fizz");
//                }else if(j%5==0 ){
//                    System.out.println("buzz");
//                }else System.out.println(j);}

//        for (int i = 10; i <=26; i++) {
//            if (i>10&&i<26&&i%2==0){
//                System.out.println("Hello Binary");
//            }
        int total = 0;
        for (int i = 1; i <51 ; i++) {
            if (i%2 !=0){
                System.out.println(i);
                total += i;
            }

            System.out.println(total);


        }


        }








    }

