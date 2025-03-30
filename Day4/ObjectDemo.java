// package Day4;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);

        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(75);
        ObjectDemo obj2 = obj1;
        
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        
        System.out.println(obj1);
        
        
        ObjectDemo obj3 = new ObjectDemo(45);
        ObjectDemo obj4 = new ObjectDemo(45);

        if(obj3==obj4){
            System.out.println("obj3 is equal to obj4; Output for syntax 1");
        }

        if(obj3.equals(obj4)){
            System.out.println("obj3 is equal to obj4; Output for syntax 2");
        }

        System.out.println(obj4 instanceof ObjectDemo);         //Check back last System.out.println() snippet of Main.java
        System.out.println(obj4 instanceof Object);

        System.out.println(obj4.getClass());                   //Specifies the entire class path
        System.out.println(obj4.getClass().getName());
        System.out.println(obj4.getClass().getConstructors());
    }
}
