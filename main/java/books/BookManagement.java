package books;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookServicesImpl svc = new BookServicesImpl();
        int choice;
        do {
            System.out.println("_______________Book Management System_______________");
            System.out.println("1: Add Book");
            System.out.println("2: Get Book");
            System.out.println("3: Delete Book");
            System.out.println("4: Update Book");
            System.out.println("5: EXIT");

            System.out.println("Enter your choice");


            choice = scan.nextInt();

            switch (choice){
                case 1:
                    svc.addBook(scan);
                    break;
                case 2:
                    svc.getBook();
                    break;
                case 3:
                    svc.deleteBook(scan);
                    break;
                case 4:
                    svc.updateBook(scan);
                    break;
                case 5:
                    System.out.println("Exit");
                default:
                    System.out.println("Invalid Choice");
            }

        }while (choice !=5);
        scan.close();
    }


}
