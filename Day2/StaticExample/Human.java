// package Day2.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human(int a, String n, int b, boolean x){
        this.age = a;
        this.name = n;
        this.salary = b;
        this.married = x;
        Human.population +=  1;
    }
}
