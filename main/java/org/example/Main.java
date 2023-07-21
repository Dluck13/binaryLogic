package org.example;

public class Main {

    //Object-Oriented Programming (OOP):

    //object state(properties,instance variables) and behaviour(methods)
    // An object encapsulates both data (attributes or fields)
    // and behavior (methods) related to the entity it represents.
    // Classes define the blueprint or template for creating objects.

    /*Encapsulation: Objects encapsulate their data and behavior,
    providing a way to bundle related data and methods together.
    Encapsulation helps maintain the integrity and
    consistency of the object's state by controlling access to its internal details.
     */

    /*Inheritance: In Java, objects can inherit properties and behaviors from other classes through inheritance.
    This allows objects to inherit and extend the functionality of existing classes
     */

    //Polymorphism:
    // Polymorphism allows objects of different classes to be treated as objects of a common superclass
    // or interface.
    int data = 13;
    char a;

    public void PrintStatement(String string){
        System.out.println(string);
    }



    public static void main(String[] args){

        int data = 25;

        System.out.println(data);
        Main obj = new Main();
        System.out.println(obj.data);
        System.out.println(obj.a);
        obj.PrintStatement("hello");



        // serves as the starting point from which the program begins executing its instructions.

        //public:
        //It is an access modifier that allows the main method to be accessed from anywhere within the program.

        /*static: It is a keyword indicating that the main method belongs to the class itself,
        rather than a specific instance of the class.
        The static keyword allows the main method to be called without creating an object of the class.*/

        //void: It is the return type of the main method, indicating that the method does not return any value.

        //main: It is the name of the method. The name main is predefined and
        // recognized by the Java Virtual Machine (JVM) as the entry point for the program.

        /*(String[] args): It is the parameter list of the main method. It accepts a single parameter,
        which is an array of strings named args.
        This parameter allows command-line arguments to be passed to the program.
         */

    }

    /*
    Integer Types:

byte: Represents a signed 8-bit integer.
It has a range from -128 to 127.

short: Represents a signed 16-bit integer.
It has a range from -32,768 to 32,767.

int: Represents a signed 32-bit integer.
It has a range from -2,147,483,648 to 2,147,483,647.

long: Represents a signed 64-bit integer.
It has a range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.

Floating-Point Types:

float: Represents a single-precision 32-bit floating-point number.
It can store fractional values with a range from approximately 1.4 x 10^(-45) to 3.4 x 10^38.

double: Represents a double-precision 64-bit floating-point number.
It can store more significant digits and has a wider range compared to float. Its range is approximately 4.9 x 10^(-324) to 1.8 x 10^308.
Character Type:

char: Represents a single Unicode character.
It uses 16 bits to store characters in the UTF-16 encoding standard.
Boolean Type:

boolean: Represents a boolean value, which can be either true or false.
It is used for logical operations and conditions.
     */

//    byte eightBit = 3;
//    short sixteenBit= 30000;
//    int thirtyTwoBit= 100000;
//    long sixtyFourBit= 10000000;
//    float thirtyTwoBitF= 1000.0f;
//    double sixtyFourBitD= 20.00;
//    char sixteenBitChar = 90;
//    char c = 'a';
//    boolean tOrF= true;

    //INSTANCE VARIABLES
    /*In Java, an instance variable is a variable defined within a class but outside any method, constructor,
    or static block. Instance variables are associated with specific instances or objects of the class.
     */

    /*
    Declaration and Scope:
    Instance variables are declared within a class,
    usually at the top of the class declaration, before any methods.
    They can be accessed and used by all methods, constructors, and blocks within the class.

Initialization:
Instance variables are automatically initialized with default values if no explicit initialization
is performed. The default values depend on the data type: 0 for numeric types, false for boolean,
null for object references, and the Unicode null character (\u0000) for char.

Lifetime:
Instance variables exist as long as the object of the class exists.
They retain their values even after method executions, allowing the object to maintain its state.

Accessibility:
Instance variables can have different access modifiers
(public, protected, private, or default)
to control their accessibility from other classes and subclasses.
This helps enforce encapsulation and data hiding principles.

Unique to Each Object:
Each object or instance of a class has its own set of instance variables.
Modifying the value of an instance variable in one object does not affect
the values of the same variable in other objects.

Relationship with Methods:
Instance variables are often accessed and modified by instance methods,
which are methods defined within the class and operate on the state of the object.
     */


}