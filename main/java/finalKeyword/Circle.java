package finalKeyword;
//class can not be extended by any other class because it is final.
public final class Circle {
    //final value can't change, the variable is constant
    final double pi = 3.14;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.print("Dimitri");


    }

    void print(String name){
        //the local variable in the print method can't be updated
        final String message = "Hello, welcome to the java world! ";
        System.out.println(message+name);
    }

    public Circle() {
    }

    public double getPi() {
        return pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                '}';
    }
}
