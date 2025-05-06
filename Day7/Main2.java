import java.util.HashSet;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        
        //Creation
        HashSet<Integer> set = new HashSet<>();
        //Similar to: ArrayList<Integer> l1 = new ArrayList<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        System.out.println(set);

        //search - contains
        System.out.println(set.contains(2));
        System.out.println(set.contains(7));

        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        set.remove(200);
        System.out.println(set);

        System.out.println("Current size of the set is:"+set.size());
        System.out.println(set);

        set.add(4);
        set.add(7);
        set.add(14);
        set.add(17);
        set.add(75);

        System.out.println(set);
        Iterator it = set.iterator();
        //hasNext(); Next();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
