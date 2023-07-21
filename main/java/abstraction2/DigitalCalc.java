package abstraction2;

public class DigitalCalc implements Calculator{




    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b;
    }

    @Override
    public double product(double a, double b) {
        return a*b;
    }
}
