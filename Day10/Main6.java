class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class Main6{
    public static void main(String[] args) throws Exception{
        
        Counter c1 = new Counter();

        Thread t1 = new Thread(() -> {
                for(int i = 1; i<= 1000; i++){
                    c1.increment();
                }
            }
        );
        Thread t2 = new Thread(() -> {
                for(int i = 1; i<= 1000; i++){
                    c1.increment();
                }
            }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: "+c1.count);
    }
}