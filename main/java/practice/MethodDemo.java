package practice;

public class MethodDemo {

    public static void main(String[] args) {
        java.lang.String myName = "Dimitri";
        MethodDemo obj = new MethodDemo();
        System.out.println("The sum of 15 and 20 is " + obj.sumOfAllNumbers(15, 20));
        int result = obj.sumOfAllNumbers(15, 20);
        System.out.println(result);
        System.out.println(myName.toUpperCase());
        obj.printName("Dimitri");
        System.out.println(findDiff(20, 18));
        obj.printName("Dimitri", "Luck");
        System.out.println(numberOfChars(" Dimitri "));



    }

    //method functionality
    public int sumOfAllNumbers(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public void printName(String name) {
        System.out.println(name.toUpperCase());
    }

    public void printName(String name, String lastName){
        System.out.println(name + " " + lastName);

    }

    public static double findDiff(double a, double b) {
        return a - b;
    }

    public static int numberOfChars(String chars){
        return chars.trim().length();
    }


}
