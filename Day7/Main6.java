import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString(){
        return "Name: "+name+"; Roll no.: "+roll;
    }

    @Override
    public int compareTo(Student that) {
        if(this.roll>that.roll)
            return 1;
        else
            return -1;
    }
}

public class Main6 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(4);
        l1.add(17);
        l1.add(14);
        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
        for(int i = 0; i<l1.size(); i++){
            for(int j = 0; j<l1.size()-1; j++){
                if(l1.get(j)>l1.get(j+1)){
                    int temp = l1.get(j);
                    l1.set(j,l1.get(j+1));
                    l1.set(j+1,temp);
                }
            }
        }
        System.out.println(l1);

        Collections.shuffle(l1);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };

        Comparator<String> com2 = new Comparator<String>() {
            public int compare(String a, String b){
                if(a.length()>b.length())
                return 1;
                else
                return -1;
            }
        };

        List<Integer> l2 = new ArrayList<>();
        l2.add(205);
        l2.add(109);
        l2.add(247);
        l2.add(856);
        System.out.println(l2);
        Collections.sort(l2,com);
        System.out.println(l2);

        List<String> l3 = Arrays.asList("zebra", "apple", "mountain", "cat", "banana");

        List<String> l4 = new ArrayList<>(List.of(
            "zebra",
            "apple",
            "mountain",
            "cat",
            "banana"
        ));

        List<String> l5 = new ArrayList<>();
        l5.add("zebra");
        l5.add("apple");
        l5.add("mountain");
        l5.add("cat");
        l5.add("banana");
        
        System.out.println(l5);

        Collections.sort(l5,com2);
        System.out.println(l5);

        List<Student> s1 = new ArrayList<Student>();
        s1.add(new Student("Saptarshi",17));
        s1.add(new Student("Saptak",14));
        s1.add(new Student("Kartik",45));
        s1.add(new Student("Saharsh",27));
        s1.add(new Student("Tanishq",11));
        s1.add(new Student("Ram",80));
        for(Student student : s1){
            System.out.println(student);
        }
        // Collections.sort(s1); <- Won't work

        System.out.println(s1);
        
        Comparator<Student> com3 = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.roll > j.roll)
                return 1;
                else
                return -1;
            }
        };
        
        Collections.sort(s1,com3);
        System.out.println(s1);

        Collections.shuffle(s1);
        System.out.println(s1);

        Collections.sort(s1);
        System.out.println(s1);

    }
}
