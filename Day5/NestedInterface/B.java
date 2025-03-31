package Day5.NestedInterface;

class A {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

public class B implements A.NestedInterface  {
    @Override
    public boolean isOdd(int num){
        if(num%2==1){
            return true;
        }
        else{
            return false;
        }
    }    
}
