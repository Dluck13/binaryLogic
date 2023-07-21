package abstraction;

public class English extends Language {

    @Override
    void info(){
        System.out.println("This is english");
    }

    @Override
    int numberOfChars(String str) {
        return str.length();
    }


}
