package Day5.Interfaces;

public class PowerEngine implements Engine{
    
    @Override
    public void start(){
        System.out.println("Engine ignited!");
    }

    @Override
    public void stop(){
        System.out.println("Engine shutting down...");
    }

    @Override
    public void accelerate(){
        System.out.println("Starting to accelerate the motion...");
    }
}
