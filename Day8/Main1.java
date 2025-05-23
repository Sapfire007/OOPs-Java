import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list.get(0));
        list.add(25.7);
        list.add(7);
        list.add("World");
        System.out.println(list.get(list.size()-1));
        Object o = list.get(2);
        System.out.println(o);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Statement-1");
        list2.add("Statement-2");
        String s = (String) list2.get(0);
        String s1 = (String) list2.get(1);
    }
}
