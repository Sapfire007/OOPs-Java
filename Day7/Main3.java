import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();


        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 100);
 
        System.out.println(map);

        map.put("China",180);
        System.out.println(map);

        //Search
        System.out.println(map.containsKey("China"));
        System.out.println(map.containsKey("Russia"));

        System.out.println(map.get("India"));
        System.out.println(map.get("Russia"));

        int arr[] = {12,15,18};
        for(int i = 0; i<3; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();


        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e);
        }
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
        }
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getValue());
        }


        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.put("France",50);
        System.out.println(map);

        map.remove("China");
        System.out.println(map);
    }
}