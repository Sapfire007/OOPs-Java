package Day5.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start(){
        System.out.println("Engine powered on!");
    }

    @Override
    public void stop(){
        System.out.println("Engine has been switched off...");
    }

    @Override
    public void accelerate(){
        System.out.println("Sport mode enabled!");
    }
    
}