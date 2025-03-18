import java.util.Arrays;
import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    float score;
    int teamNo = 7;
}

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[10];
        Student Sap = new Student();
        System.out.println(students);   //Memory address
        System.out.println(Arrays.toString(students));   //[null, null, null, null, null, null, null, null, null, null]
        System.out.println(Sap.rollNo);
        System.out.println(Sap.name);
        System.out.println(Sap.score);
        
        Sap.rollNo = 17;
        System.out.println(Sap.rollNo);
        Sap.name = "Saptarshi";
        Sap.score = 92.45f;
        System.out.println(Sap.name);
        System.out.println(Sap.score);
        System.out.println(Sap.teamNo);
        
        Sap.teamNo = 4;
        System.out.println(Sap.teamNo);

        in.close();


    }
}