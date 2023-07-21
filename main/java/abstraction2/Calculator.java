package abstraction2;

public interface Calculator {

    int data = 3;

    //interface does not have constructor
    //Only way to be able to do multiple inheritance

    double add(double a, double b);

    double minus(double a, double b);

    double product(double a, double b);

    private void display(){
        System.out.println("hello");
    }

    static void printBye(){
        System.out.println("Bye");
    }



}
