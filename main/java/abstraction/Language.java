package abstraction;

public abstract class Language {
    //abstract
    //interface
    //hiding implementation and using the functionality
    //abstract classes can not be instantiated

    void info(){
        System.out.println("This is available");
    }

    abstract int numberOfChars(String str);

}
