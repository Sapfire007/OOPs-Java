import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main4 {
    public static void main(String[] args) {
        Collection values = new ArrayList<>();
        values.add(4);
        values.add(7);
        values.add(14);

        System.out.println(values);

        Iterator it = values.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        it = values.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
