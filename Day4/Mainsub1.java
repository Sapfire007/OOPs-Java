package Day4;

public class Mainsub1 extends Info1{
    public Mainsub1(){
        super();
    }
    public static void main(String[] args) {
        Info1 a2 = new Info1(10000000000L, "Neel");
        a2.setRNo(15);
        System.out.println(a2.getRNo());
        System.out.println(a2.name);
    }
}