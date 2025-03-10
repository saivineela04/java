package Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int[] result = removeDuplicates(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
