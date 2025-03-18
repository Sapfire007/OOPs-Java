public class WrapperExample {
    public static void main(String[] args) {
        int a = 45;
        // Integer num = new Integer(75);
        Integer number = 95;
        System.out.println(a);
        // System.out.println(num);
        System.out.println(number);

        int x = 10;
        int y = 20;

        swap(x, y); //swap(10,20);
        System.out.println(x+"  "+y); //10   20



    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
