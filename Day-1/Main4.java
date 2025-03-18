public class Main4 {
    public static void main(String[] args) {
        final int INCREASE = 2;
        System.out.println(INCREASE);
        // INCREASE = 3;            <- will give error
        

        final A SAP = new A("Saptarshi Bose");
        SAP.name = "Sapfire";


        //When a non-primitive is final, you cannot reassign it.
        // SAP = new A("Other name");
        


        //Observe this part to experience garbage collection
        A obj;
        for(int i=0; i<1000000000; i++){
            obj = new A("Random name");
        }
        
    }
}

class A{
    // final int num;      <- Should always initialize final field
    
    String name;
    public A(String name){

        // System.out.println("Object has been created");
        this.name = name;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has been destroyed.");
    }
}
