package students;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentServicesImpl implements StudentServices{

    private static final int MAX_STUDENTS = 20;
    public static Student[] studentList = new Student[MAX_STUDENTS];
    public static int numStudents = 0;

    @Override
    public void addStudent(Scanner scan) {
        if(numStudents >= MAX_STUDENTS) {
            System.out.println("class is full");
        return;}
        System.out.println("Enter ID");
        int studentId = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter student name");
        String studentName = scan.nextLine();

        System.out.println("Enter email");
        String studentEmail = scan.nextLine();

        System.out.println("Enter grade");
        double studentGrade = scan.nextDouble();
        scan.nextLine();

        Student s1 = new Student(studentId,studentName,studentEmail,studentGrade);
        studentList[numStudents++]= s1;
        System.out.println("Student added successfully");

    }


    @Override
    public void updateStudent(Scanner scan) {
        if (numStudents == 0) {
            System.out.println("No students exist");
            return;
        }

        System.out.println("Update student by the index starting at (0 to " + (numStudents-1)+ ") " );
        int index = scan.nextInt();
        if(index >= 0 && index <numStudents){
            System.out.println("Enter new ID");
            int newStudentId = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter new name");
            String newStudentName = scan.nextLine();

            System.out.println("Enter new email");
            String newStudentEmail = scan.nextLine();

            System.out.println("Enter new grade");
            double newStudentGrade = scan.nextDouble();
            scan.nextLine();

            Student updatedStudent = new Student(newStudentId,newStudentName,newStudentEmail,newStudentGrade);
            studentList[index] = updatedStudent;
            System.out.println("Student updated successfully");
            }else {
            System.out.println("Student doesn't exist");
        }

    }

    @Override
    public void getStudents() {
        if (numStudents == 0) {
            System.out.println("No students exist");
            return;
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Get Students");
        for (int i = 0; i <numStudents ; i++) {
            System.out.println(studentList[i]);
            ;
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++S");

        }


    @Override
    public void deleteStudent(Scanner scan) {
        if(numStudents == 0){
            System.out.println("no student found to remove");
            return;
        }
        System.out.println("Remove student by the index starting at (0 to " + (numStudents-1)+ ") " );
        int index = scan.nextInt();
        if(index >= 0 && index <numStudents){
            for (int i = index; i <numStudents-1 ; i++) {
                studentList[i]=studentList[i+1];
            }
            studentList[numStudents-1]=null;
            numStudents--;
            System.out.println("Student removed");
        }else {
            System.out.println("Invalid index, No Student removed");
        }

    }
}
