package entity;

public class Dog extends Animal {

    private String breed;

    private String eyeColor;

    private boolean huntingDog;

    @Override
    public void makeSound(){
        System.out.println("dog barks");
    }

    @Override
    public void move(){
        System.out.println("dog runs");
    }
    @Override
    public void eat(){
        System.out.println("dog eats");
    }

    @Override
    public void display(){
        super.display();
        System.out.println(breed);
        System.out.println(huntingDog);
        System.out.println(eyeColor);
    }

    public Dog() {
    }

    public Dog(String name, String color, int numOfLegs, boolean eatsMeat, String breed, String eyeColor, boolean huntingDog) {
        super(name, color, numOfLegs, eatsMeat);
        this.breed = breed;
        this.eyeColor = eyeColor;
        this.huntingDog = huntingDog;
    }

    public Dog(String breed, String eyeColor, boolean huntingDog) {
        this.breed = breed;
        this.eyeColor = eyeColor;
        this.huntingDog = huntingDog;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isHuntingDog() {
        return huntingDog;
    }

    public void setHuntingDog(boolean huntingDog) {
        this.huntingDog = huntingDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", huntingDog='" + huntingDog + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", numOfLegs=" + getNumOfLegs() +
                ", eatsMeat=" + itEatsMeat() +
                '}';
    }
}
