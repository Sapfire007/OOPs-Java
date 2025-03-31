package Day5.ExtendInterfaces;

public class Main implements B, C{

    @Override
    public void fun(){

    }

    @Override
    public void greet(){

    }

    public static void main(String[] args) {
        A.greeting();      //Call via the interface name
    }
}