package Collections;
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add 10 elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        list.add("Kiwi");

        Iterator<String> iterator = list.iterator();
        System.out.println("ArrayList elements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.add(2, "Blueberry");

       
        list.remove("Cherry");

        list.remove(5);

        list.set(3, "Mango");

        
        System.out.println("Element at index 4: " + list.get(4));

        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("Size of ArrayList: " + list.size());

        System.out.println("Is 'Mango' in the list? " + list.contains("Mango"));

        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}