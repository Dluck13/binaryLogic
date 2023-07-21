package students;

import practice.Switch;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentServicesImpl svc = new StudentServicesImpl();
        int choice;
        do {
            System.out.println("_______________Student Management System_______________");
            System.out.println("1: Add Student");
            System.out.println("2: Get Student");
            System.out.println("3: Delete Student");
            System.out.println("4: Update Student");
            System.out.println("5: EXIT");

            System.out.println("Enter your choice");


            choice = scan.nextInt();

            switch (choice){
                case 1:
                    svc.addStudent(scan);
                    break;
                case 2:
                    svc.getStudents();
                    break;
                case 3:
                    svc.deleteStudent(scan);
                    break;
                case 4:
                    svc.updateStudent(scan);
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
