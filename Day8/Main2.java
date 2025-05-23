import Main2.Box;

public class Main2 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(); //Box is now type safe
        b1.setValue(1);

        //String val1 = (String) b1.getValue(); // <- error

        int val1 = b1.getValue();
        System.out.println(val1);
    }
}
