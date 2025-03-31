package Day5.ExtendInterfaces;

public interface A {

    // Static interface method should always have a body
    // Call via the interface name
    static void greeting(){
        System.out.println("Hey I'm inside a static block!");
    }

    void fun();
}