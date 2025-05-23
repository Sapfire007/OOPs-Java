class Hi implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

public class Main5{
    public static void main(String[] args) throws Exception {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        System.out.println(t1.getName());
        t2.setName("Hello Thread");
        System.out.println(t2.getName());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        
        t1.setPriority(Thread.MIN_PRIORITY); // Same as t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY); // Same as t2.setPriority(10);
        
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try{
            Thread.sleep(100);
        }catch(Exception e){}
        t2.start();

        Runnable obj3 = new Runnable(){
            public void run(){
                for(int i = 0; i<5; i++){
                    System.out.println("Namaste");
                    try{
                        Thread.sleep(500);
                    } catch (Exception e){}
                }
            }
        };
        Runnable obj4 = () -> {
                for(int i = 0; i<5; i++){
                    System.out.println("India "+Thread.currentThread().getPriority());
                    try{
                        Thread.sleep(500);
                    } catch (Exception e){}
                }
            };

        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t3.start();
        try{
            Thread.sleep(100);
        } catch(Exception e){}
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("End of program");
    }
}
