// package Day6;
class Student{
    private int id;

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numerator = {42,36,54,78,67};
        int[] denominator = {2,1,0,10,32};
        for(int i = 0; i<10; i++){
            try{
                Divide(numerator[i],denominator[i]);
            }catch(ArrayIndexOutOfBoundsException aX){
                System.out.println("Error caught : "+aX);
            }
            // Divide(numerator[i],denominator[i]);
        }
        
        try{
            Student student1;
            student1 = null;
            student1.setID(21);
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Oops something went wrong...");
        }
        
        System.out.println("This is the ending line.");
    }

    public static void Divide(int a, int b){
        try{
            System.out.println(a/b);;
        }catch(ArithmeticException e){
            System.out.println(e + ": Undefined");
        }
    }
}