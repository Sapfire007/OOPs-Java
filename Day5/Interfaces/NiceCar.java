package Day5.Interfaces;

public class NiceCar {
    private Engine engine;

    private Media mPlayer = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void startMusic(){
        mPlayer.start();
    }

    public void stopMusic(){
        mPlayer.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
        System.out.println("Your engine has been upgraded to an electic engine!");
    }
}