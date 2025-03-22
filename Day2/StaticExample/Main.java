// package Day2.StaticExample;

//If both the java files are in the same folder we dont need to put the import statement
public class Main {
    public static void main(String[] args) {
        Human obj1 = new Human(18, "Saptarshi", 50000, false);
        Human obj2 = new Human(25, "Rohit", 100000, true);

        System.out.println(obj1.name);
        System.out.println(obj1.population);
        System.out.println(obj2.name);
        System.out.println(obj2.population);
        System.out.println(obj2.population);

        System.out.println(Human.population);

        Main ob1 = new Main();
        ob1.greet();
    }



    //This is not dependent on object
    public static void fun(){
        // greet();              <- Error
        System.out.println("This is inside fun");



        //Well this can be done
        // Main ob2 = new Main();
        // ob2.greet();
    }


    //Something which is not static belongs to an object
    //This is dependent on object
    void greet(){
        System.out.println("Hello World");
        fun();
    }
}
