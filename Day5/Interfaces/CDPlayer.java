package Day5.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start(){
        System.out.println("Starting music player ...");
    }

    @Override
    public void stop(){
        System.out.println("Stopped playing music.");
    }
}
