package Day4;

class Dummy{}
class Info1 extends Dummy{
    private long phNo;
    String name;
    int[] arr;
    protected int rNo;

    Info1(){
        this.phNo = -1;
        this.name = null;
        this.arr = new int[0];
    }

    Info1(long phNo, String name){
        this.phNo = phNo;
        this.name = name;
        int x = (int)(phNo%100);
        this.arr = new int[x];
    }

    public void setPhNo(long phNo){
        this.phNo = phNo;
    }

    public long getPhNo(){
        return phNo;
    }

    public void setRNo(int rNo){
        this.rNo = rNo;
    }

    public int getRNo(){
        return rNo;
    }
}

public class Main {
    public static void main(String[] args) {
        Info1 a1 = new Info1(1234567890L, "Saptarshi");
        System.out.println(a1.getPhNo());
        a1.setPhNo(5522336692L);
        System.out.println(a1.getPhNo());
        
        System.out.println(a1 instanceof Dummy);
        System.out.println(a1 instanceof Object);
    }
}