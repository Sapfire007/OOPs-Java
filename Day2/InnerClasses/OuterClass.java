// package Day2.InnerClasses;

public class OuterClass {

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Saptarshi");
        Test b = new Test("Rohit");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
