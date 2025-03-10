package Arrays;
import java.util.HashSet;

public class RemoveDuplicatesReturn {
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        return set.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 5};
        int[] result = removeDuplicates(array);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}