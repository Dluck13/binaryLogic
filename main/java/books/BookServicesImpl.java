package books;

import java.util.Scanner;

public class BookServicesImpl implements BookServices {

    private static final int MAX_BOOKS = 20;
    public static Book[] bookList = new Book[MAX_BOOKS];
    public static int numBooks = 0;

    @Override
    public void addBook(Scanner scan) {
        if(numBooks >= MAX_BOOKS) {
            System.out.println("class is full");
        return;}
        System.out.println("Enter ID");
        int bookId = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter book name");
        String bookName = scan.nextLine();

        System.out.println("Enter author");
        String bookAuthor = scan.nextLine();

        System.out.println("Enter price");
        double bookPrice = scan.nextDouble();
        scan.nextLine();

        Book s1 = new Book(bookId,bookName,bookAuthor,bookPrice);
        bookList[numBooks++]= s1;
        System.out.println("book added successfully");

    }


    @Override
    public void updateBook(Scanner scan) {
        if (numBooks == 0) {
            System.out.println("No books exist");
            return;
        }

        System.out.println("Update book by the index starting at (0 to " + (numBooks-1)+ ") " );
        int index = scan.nextInt();
        if(index >= 0 && index <numBooks){
            System.out.println("Enter new ID");
            int newBookId = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter new name");
            String newBookName = scan.nextLine();

            System.out.println("Enter new author");
            String newBookAuthor = scan.nextLine();

            System.out.println("Enter new price");
            double newBookPrice = scan.nextDouble();
            scan.nextLine();

            Book updatedBook = new Book(newBookId,newBookName,newBookAuthor,newBookPrice);
            bookList[index] = updatedBook;
            System.out.println("Book updated successfully");
            }else {
            System.out.println("Book doesn't exist");
        }

    }

    @Override
    public void getBook() {
        if (numBooks == 0) {
            System.out.println("No books exist");
            return;
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Get Books");
        for (int i = 0; i <numBooks ; i++) {
            System.out.println(bookList[i]);
            ;
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++S");

        }


    @Override
    public void deleteBook(Scanner scan) {
        if(numBooks == 0){
            System.out.println("no book found to remove");
            return;
        }
        System.out.println("Remove book by the index starting at (0 to " + (numBooks-1)+ ") " );
        int index = scan.nextInt();
        if(index >= 0 && index <numBooks){
            for (int i = index; i <numBooks-1 ; i++) {
                bookList[i]=bookList[i+1];
            }
            bookList[numBooks-1]=null;
            numBooks--;
            System.out.println("Book removed");
        }else {
            System.out.println("Invalid index, No Book removed");
        }

    }
}
