package Day5.Interfaces;

public class Car implements Engine, Brake, Media{

    int random = 45;

    @Override
    public void start() //Here it doesnt matter about start()'s origin
    {
        System.out.println("Engine ignited!");
    }

    @Override
    public void stop() //Here it doesnt matter about stop()'s origin
    {
        System.out.println("Engine shut down...");
    }

    @Override
    public void brake(){
        System.out.println("Brakes have been engaged.");
    }

    @Override
    public void accelerate(){
        System.out.println("Starting to accelerate the motion...");
    }
}