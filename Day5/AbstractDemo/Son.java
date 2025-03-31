package Day5.AbstractDemo;

public class Son extends Parent {

    Son(int age){
        super(age);
    }

    @Override
    void Career(String name){
        System.out.println("I dream to become a "+name+".");
    }

    @Override
    void FutureSettlement(String country, int salary){
        System.out.println("I want to settle in "+country+" and earn $"+salary+" annually.");
    }

    @Override
    void Gender(){
        System.out.println("Gender: Male");
    }

    @Override
    void Normal(){
        super.Normal();
    }

}