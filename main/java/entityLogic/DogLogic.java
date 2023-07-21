package entityLogic;

import entity.Animal;
import entity.Dog;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DogLogic {


    public static void main(String[] args) {
        //static polymorphism or compile time polymorphism overriding
        Dog jonas = new Dog("Jonas","black", 4,
                true, "sheperd", "blue", false );
        jonas.display();
        jonas.eat();
        jonas.move();
        jonas.makeSound();


        Dog[] dogs = new Dog[1];
        dogs[0]= jonas;
        System.out.println(Arrays.stream(dogs).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.stream(dogs).count());
        System.out.println(Arrays.stream(dogs).anyMatch(Animal::itEatsMeat));

        Animal animal1 = new Dog();

        Dog dog1 = new Dog();





    }
}
