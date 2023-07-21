package abstraction2;

public class Player implements Moves, Car{
    private String name;

    private int age;

    @Override
    public void moveRight() {
        System.out.println("Player moves up");

    }

    @Override
    public void moveLeft() {
        System.out.println("Player moves left");

    }

    @Override
    public void moveUp() {
        System.out.println("Player moves up");

    }

    @Override
    public void moveDown() {
        System.out.println("Player moves down");

    }

    @Override
    public void duck() {
        System.out.println("Player moves duck");

    }

    @Override
    public void jump() {

        System.out.println("Player moves jumps");

    }

    @Override
    public void run() {

        System.out.println("Player moves runs");

    }

    @Override
    public void talk() {

        System.out.println("Player moves talks");

    }

    @Override
    public void swim() {
        System.out.println("Player moves swim");

    }

    @Override
    public void drive() {

        System.out.println("Player drives");

    }

    @Override
    public void sleep() {
        System.out.println("Player moves sleeps");

    }

    @Override
    public void wakeUp() {
        System.out.println("Player wakes up");
    }

    @Override
    public void eat() {
        System.out.println("Player eats");
    }

    public Player() {
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void startCar() {
        System.out.println("Start car");

    }

    @Override
    public void fuelCar() {
        System.out.println("fuel car");

    }

    @Override
    public void openCarDoor() {
        System.out.println("open car door");

    }

    @Override
    public void closeCarDoor() {
        System.out.println("close car door");

    }

    @Override
    public void lockCar() {
        System.out.println("lock car");

    }

    @Override
    public void unlockCar() {
        System.out.println("unlock car");

    }

    @Override
    public void steerLeft() {
        System.out.println("Steer car left");

    }

    @Override
    public void steerRight() {
        System.out.println("Steer car right");

    }

    @Override
    public void accelerate() {
        System.out.println("accelerate");

    }

    @Override
    public void brake() {
        System.out.println("brake");

    }
}
