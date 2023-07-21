package entityLogic;

import entity.Book;
import entity.Product;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BookLogic {

    public static void main(String[] args) {

        Product p1 = new Product("Aleksandr", 100.00);
        p1.display();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Book[] books = new Book[2];


        Book book1 = new Book("Java", 20.00, "Dimitri", 15);
        books[0] = book1;


        book1.display();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Book book2 = new Book("Magic", 15.00, "Wizzard", 100);
        books[1] = book2;
        book2.display();

        System.out.println(Arrays.stream(books).distinct().collect(Collectors.toList()));

    }


}






