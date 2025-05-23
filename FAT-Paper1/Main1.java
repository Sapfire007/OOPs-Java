// package FAT-Paper1;

import java.util.*;

class Student{
    private String studentID;
    private String name;
    private int age;
    private int[] marks;

    public Student(String studentID, String name, int age, int[] marks){
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("Student ID: "+studentID+"\nName: "+name+"\nAge: "+age+"\nMarks: "+Arrays.toString(marks));
    }

    public double calculateAverage(){
        int sum = 0;
        int len = marks.length;
        for(int i:marks){
            sum += i;
        }
        return (double) (sum/len);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String a = in.nextLine();
        System.out.print("Enter name: ");
        String b = in.nextLine();
        System.out.print("Enter age: ");
        int c = in.nextInt();
        System.out.println("Enter marks: ");
        int marks[] = new int[5];
        for(int i = 1; i<=5; i++){
            System.out.print("Enter marks for Subject "+i+": ");
            marks[i-1] = in.nextInt();
            System.out.println();
        }
        Student s1 = new Student(a, b, c, marks);
        s1.displayDetails();
        double avg1 = s1.calculateAverage();
        if(avg1>=50)
        System.out.println("Result: Pass");
        else
        System.out.println("Result: Fail");
    }
}