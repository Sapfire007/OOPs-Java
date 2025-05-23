abstract class A{
    public abstract void show();
}

class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}

abstract class C{
    public abstract void view();
    public abstract void display();
}

public class Main5 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        C obj2 = new C(){
            @Override
            public void view(){
                System.out.println("Inside abstract anonymous class, in view");
            }
            public void display(){
                System.out.println("Inside abstract anonymous class, in display");
            }
        };
        obj2.view();
    }
}
