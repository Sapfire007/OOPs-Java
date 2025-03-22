class Student{
    int rNo;
    String name;
    float grade;

    Student(int r, String n, float g){
        this.rNo = r;
        this.name = n;
        this.grade = g;
    }

    Student(){
        this(404,"Default name",0.0f);
    }
}

public class Main3 {
    public static void main(String[] args) {
        //Calling a constructor from another constructor
        Student random = new Student();

        System.out.println(random.rNo);
        System.out.println(random.name);
        System.out.println(random.grade);

        //==================================================================================

        Student one = new Student();
        Student two = one;

        one.name = "Name of object: 'one' has been changed";
        System.out.println(two.name);
    }
}