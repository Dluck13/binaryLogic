package entity;

public class Animal {
    private String name;

    private String color;

    private int numOfLegs;

    private boolean eatsMeat;

    public void makeSound(){
        System.out.println("animal makes sound");
    }

    public void move(){
        System.out.println("animal moves");
    }

    public void eat(){
        System.out.println("animal eats");
    }

    public void display(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(eatsMeat);
        System.out.println(numOfLegs);
    }

    public Animal() {
    }

    public Animal(String name, String color, int numOfLegs, boolean eatsMeat) {
        this.name = name;
        this.color = color;
        this.numOfLegs = numOfLegs;
        this.eatsMeat = eatsMeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean itEatsMeat() {
        return eatsMeat;
    }

    public void setEatsMeat(boolean eatsMeat) {
        this.eatsMeat = eatsMeat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numOfLegs=" + numOfLegs +
                ", eatsMeat=" + eatsMeat +
                '}';
    }
}
