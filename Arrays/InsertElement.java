package Arrays;

public class InsertElement {
    public static int[] insertElement(int[] arr, int value, int position) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }
        newArray[position] = value;
        for (int i = position; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = insertElement(arr, 10, 2);
        for (int i : newArr) {
            System.out.println(i);
        }
    }
}
