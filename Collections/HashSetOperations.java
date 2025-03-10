package Collections;
import java.util.HashSet;
import java.util.Iterator;

class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add 10 elements
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("Orange");
        set.add("Purple");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Brown");

        System.out.println("HashSet elements: " + set);

        set.add("Gray");

        set.remove("Black");

        System.out.println("Does HashSet contain 'Blue'? " + set.contains("Blue"));

        System.out.println("Size of HashSet: " + set.size());

        System.out.println("Iterating HashSet:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String[] array = set.toArray(new String[0]);
        System.out.println("Converted HashSet to Array: ");
        for (String color : array) {
            System.out.println(color);
        }

  
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}