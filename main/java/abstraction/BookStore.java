package abstraction;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BookStore {



    private Book[] books;

    public BookStore(Book[] books) {
        this.books = books;
    }

    public void displayBooks(){
        for(Book booksList: books){
            booksList.displayInfo();
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Book newBook = new TextBook("Math ", "Socrates ", 20.00 , " education ", "mathematics");
        Book newBook1 = new TextBook("Science ", "Socrates ", 20.00 , " education ", "science");
        Book newBook2 = new TextBook("History ", "Socrates ", 20.00 , " education ", "history");
        Book[] books = new Book[3];
        books[0] = newBook;
        books[1] = newBook1;
        books[2] = newBook2;
        newBook.displayInfo();

        System.out.println(Arrays.stream(books).distinct().collect(Collectors.toList()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        Arrays.stream(books).limit(3).forEach(System.out::println);





    }

        }


