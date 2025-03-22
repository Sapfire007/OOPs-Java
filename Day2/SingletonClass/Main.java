// package Day2.SingletonClass;

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();


        // If you print obj1, obj2, and obj3, you'll see that they all refer to the same memory address, proving that only one instance of the Singleton class exists.
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        // The memory address printed is that of obj1, because obj1 = Singleton.getInstance() is the first call to getInstance().

        // All three reference variables are just pointing to one object
    }
}
