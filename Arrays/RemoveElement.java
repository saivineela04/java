package Arrays;
public class RemoveElement {
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        int[] result = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = removeElement(arr, 3);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
