import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();


        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);

        System.out.println(l1.get(2));

        l1.add(1,7);      //l1.add(index,value) <- inserting value at index
        System.out.println(l1);

        //set element
        l1.set(2, 4);
        System.out.println(l1);

        //delete element
        l1.remove(1);
        System.out.println(l1);

        //size
        int size1 = l1.size();
        System.out.println(size1);

        //loops
        for(int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i)+", ");
        }
        System.out.println();
        
        //sorting
        Collections.sort(l1);
        System.out.println(l1);
    }
}
