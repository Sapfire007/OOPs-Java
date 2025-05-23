import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main9 {
    public static void main(String[] args) {
        // Using non-generic ArrayList to store student names
        ArrayList studentNames = new ArrayList();

        // Adding student names
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Daisy");

        // Display student names using Iterator
        System.out.println("Student Names:");
        Iterator it = studentNames.iterator();
        while (it.hasNext()) {
            System.out.println("-> " + it.next());
        }

        // Using non-generic HashMap to associate roll numbers with names
        HashMap studentMap = new HashMap();

        // Adding roll numbers with duplicate check
        addStudent(studentMap, 101, "Alice");
        addStudent(studentMap, 102, "Bob");
        addStudent(studentMap, 103, "Charlie");
        addStudent(studentMap, 101, "Daisy");  // duplicate roll number

        // Display roll numbers and corresponding student names using for-each
        System.out.println("\nStudent Roll Numbers and Names:");
        for (Object entryObj : studentMap.entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void addStudent(HashMap map, int roll, String name) {
        if (map.containsKey(roll)) {
            System.out.println("Duplicate roll number not allowed: " + roll);
        } else {
            map.put(roll, name);
        }
    }
}
