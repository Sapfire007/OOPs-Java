public class Main1{
    public static void main(String[] args) {
        int numerators[] = {11,22,33,44,55};
        int denominators[] = {1,2,0,4,5};
        for(int i = 0; i<numerators.length; i++){
            System.out.println(divide(numerators[i],denominators[i]));
        }
    }

    public static double divide(int a, int b){
        try{
            return a/b;
        } catch (ArithmeticException e){
            System.out.println("Exception occured: "+e);
            return -1;
        }
    }
}