import java.util.ArrayList;
import java.util.List;
public class Main5 {
    public static void main(String[] args) {
        List values = new ArrayList<>();
        values.add(4);
        values.add(7);
        values.add(14);

        System.out.println(values);

        values.add(0,75);
        values.add("45");
        // values.add(1,4);
        // values.add(0,1);

        System.out.println(values);

        for(Object i:values){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        for(int i=0; i<values.size();i++){
            System.out.println(values.get(i));
        }
    }
}
