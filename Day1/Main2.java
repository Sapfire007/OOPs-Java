class Student{
    int rNo;
    String name;
    float marks = 50f;

    void greeting(){
        System.out.println("Hello! My name is "+name+".");
    }

    Student(){
        this.rNo = 17;
        this.name = "Saptarshi";
        this.marks = 95f;
    }

    void changeName(String newName){
        name = newName;
    }


    Student(int roll, String n, float m){
        this.rNo = roll;
        this.name = n;
        this.marks = m;
    }

    Student(Student other){
        this.rNo = other.rNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    
}

public class Main2 {
    public static void main(String[] args) {

        Student Sap = new Student();
        Sap.greeting();
        Sap.changeName("Sapfire");
        System.out.println(Sap.rNo);
        System.out.println(Sap.name);
        System.out.println(Sap.marks);
        
        Student Neha = new Student(2,"Neha",94);
        System.out.println(Neha.rNo);
        System.out.println(Neha.name);
        System.out.println(Neha.marks);
        



        //Note this :
        Student newStudent = new Student(Neha);


        System.out.println(newStudent.rNo);
        System.out.println(newStudent.name);
        System.out.println(newStudent.marks);



        


    }
}