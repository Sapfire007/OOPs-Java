// public package Day2.SingletonClass;

class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // Check if only one object is created or not
        if(instance == null){
            instance = new Singleton();
        } 
        
        return instance;

    }
}