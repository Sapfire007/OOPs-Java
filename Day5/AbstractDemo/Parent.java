package Day5.AbstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }

    abstract void Career(String profession);
    abstract void FutureSettlement(String country, int salary);
    abstract void Gender();

    // Note: You cannot create objects of parent class
    // Note: You cannot create "abstract constructors"

    static void hello(){
        System.out.println("Hey there!");
    }

    void Normal(){
        System.out.println("This is a normal method.");
    }
}