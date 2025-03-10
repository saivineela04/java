package Collections;
import java.util.HashMap;

class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Emma");
        students.put(106, "Frank");
        students.put(107, "Grace");
        students.put(108, "Hannah");
        students.put(109, "Ian");
        students.put(110, "Jack");

        students.put(111, "Kelly");

        System.out.println("Student with ID 103: " + students.get(103));

        HashMap<Integer, String> clonedMap = new HashMap<>(students);
        System.out.println("Cloned HashMap: " + clonedMap);

        System.out.println("Does key 105 exist? " + students.containsKey(105));

        System.out.println("Is 'Emma' in the map? " + students.containsValue("Emma"));

        System.out.println("Is the map empty? " + students.isEmpty());

        System.out.println("Size of the HashMap: " + students.size());

        System.out.println("Keys in the HashMap: " + students.keySet());

        System.out.println("Values in the HashMap: " + students.values());

        students.remove(108);
        System.out.println("HashMap after removing key 108: " + students);

        HashMap<Integer, String> newMap = new HashMap<>(students);
        System.out.println("New copied HashMap: " + newMap);
    }
}
