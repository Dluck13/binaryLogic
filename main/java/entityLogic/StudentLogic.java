package entityLogic;

import entity.FifthGrader;
import entity.Student;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StudentLogic {

    public static void main(String[] args) {

        FifthGrader[] fifthGraders = new FifthGrader[1];

        Student s1 = new Student(1, "Lucky", 95.00);
        FifthGrader s2 = new FifthGrader(2, "Alek", 90.00, "5th", "SHS");
        fifthGraders[0]=s2;
        System.out.println(s2);
        s2.display();
        System.out.println("++++++++++++++++++++++++++++++");
        s1.display();
        System.out.println(Arrays.stream(fifthGraders).distinct().collect(Collectors.toList()));




    }




}
