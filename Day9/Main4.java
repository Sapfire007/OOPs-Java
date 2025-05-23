class A{
    int age;
    public void show(){
        System.out.println("In show");
    }

    class B{
        public void config(){
            System.out.println("In class B, in config");
        }
    }

    static class C{
        public void display(){
            System.out.println("In static class C, in display");
        }
    }
}

class AnonymousHelper{
    public void writeUp(){
        System.out.println("In class AnonymousHelper, in writeUp");
    }
}

public class Main4 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        A.B obj2 = obj1.new B();
        obj2.config();
        A.C obj3 = new A.C();
        obj3.display();


        AnonymousHelper obj4 = new AnonymousHelper(){
            public void writeUp(){
                System.out.println("From class Anonymous Class, modifying writeUp");
            }
        };
        obj4.writeUp();
    }
}
