// package Day2.StaticExample;

//This is a demo to show initializing of static variables
public class StaticBlock {
    static int a = 7;
    static int b;

    //Will run only once when, when the first obj1 is created, i.e. when the class is loaded for the first time
    static{
        System.out.println("This is inside static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+"        "+StaticBlock.b);

        StaticBlock.b += 5;

        System.out.println(StaticBlock.a+"        "+StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+"        "+StaticBlock.b);
    }
}
