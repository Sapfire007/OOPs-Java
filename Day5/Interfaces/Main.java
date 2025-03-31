package Day5.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.accelerate();
        car1.brake();
        car1.stop();

        Engine car2 = new Car(); //[The methods within the Eangine interface can only be accessed but the version of it depends on Car()]
        System.out.println(car2.random);


        NiceCar car3 = new NiceCar();
        car3.start();
        car3.startMusic();
        car3.accelerate();
        car3.stop();
        
        car3.upgradeEngine();
        car3.start();
        car3.accelerate();
        car3.startMusic();
        car3.stop();
        car3.stopMusic();
    }
}