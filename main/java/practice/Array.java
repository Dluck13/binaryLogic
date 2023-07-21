package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Array {

    public static void main(String[] args) {
//        String[] cars = new String[6];
//        cars[0]= "Toyota";
//        cars[1]= "Ford";
//        cars[2]= "Kia";
//        cars[3]= "BMW";
//        cars[4]= "Chevy";
//        cars[5]= "Ram";
//        for (int i = 0; i < cars.length ; i++) {
//            System.out.println(cars[i]);}
//        System.out.println(Arrays.toString(cars));
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
//        List<String> carValues = Arrays.stream(cars).distinct().collect(Collectors.toList());
//        System.out.println(carValues);
//        System.out.println("+++++++++++++++++++++++++++++++");
//        for(String carsToday: cars){
//            System.out.println(carsToday);
            System.out.println("+++++++++++++++++++++++++");
//            int[] ages = {1,2,3,4,5,6,7,8,9};
//            for (int i = 0; i <9 ; i++) {
//              if(i>=3){
//                  System.out.println(ages[i]);
//                  System.out.println("++++++++++++++++++++++++++++++");
//                  int[] adults = {12,15,24,25,44,11,23,34,12,34,45,10};
//                  int adultsHere = 0;
//                  for(int adultsCounted: adults)
//                  {
//                      if(adultsCounted>=18){
//                          adultsHere++;
//                  }
//                  }                      System.out.println("There are " +adultsHere+"adults");

//        boolean[] arrayOfSheep = {true, true, false, true, true, false, true, false, true, false,true,false};
//        int numOfSheep=0;
//        for(boolean countSheep: arrayOfSheep)
//            if(countSheep){
//                numOfSheep++;
//            }
//        System.out.println("There are "+numOfSheep+ " sheep");

//        int[] odds = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
//        int oddSum= 0;
//        for (int i = 0; i <=21 ; i++) {
//            if(i%2 !=0){
//                oddSum+=i;
//            }
//        }
//        System.out.println("Odd number sum equals to " + oddSum);

        double[] doubleArr = {2.3, 4.5, 1.1, 2.3, 3.4};
        double sum = 0.0;
        for (int i = 0; i <doubleArr.length; i++) {
            sum+=doubleArr[i];

        }
        System.out.println("Double array sum = "+ sum);
        System.out.println("Max is equal to "+Arrays.stream(doubleArr).max());
        System.out.println("Max is equal to "+Arrays.stream(doubleArr).min());






        }


    }





















