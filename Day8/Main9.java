import java.util.*;
import java.lang.Number;

public class Main9 {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1,2,2.5,22)));
    }
    public void printArrayList(ArrayList<?> list){
        for(Object o: list){
            System.out.println(o);
        }
    }
    public Object getFirst(ArrayList<?> list){
        return list.get(0);
    }
    
    // public <T> T getFirst(ArrayList<T> list){
    //     return list.get(0);
    // }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination){
        for(T item:source){
            destination.add(item);
        }
    }

    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for(Number o: numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    public static void printNumbers(List<? super Integer> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }
}
