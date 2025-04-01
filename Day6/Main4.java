// package Day6;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(divide(25, 0));
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        } catch(Exception e){
            System.out.println(e);
            return -1;
        }finally{
            System.out.println("Bye!");
        }
    }
}
