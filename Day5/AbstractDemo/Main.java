package Day5.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son1 = new Son(18);
        son1.Gender();
        son1.Career("Software Developer");
        son1.FutureSettlement("New York", 500000);
        System.out.println("Son's age : "+son1.age);
        
        System.out.println("====================================================================");
        
        Daughter daughter1 = new Daughter(20);
        daughter1.Gender();
        daughter1.Career("Doctor");
        daughter1.FutureSettlement("Italy", 750000);
        System.out.println("Daughter's age: "+daughter1.age);
        
        System.out.println("====================================================================");

        Parent.hello();

        son1.Normal();
        daughter1.Normal();        
        
    }
}