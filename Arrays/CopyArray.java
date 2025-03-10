package Arrays;

public class CopyArray {
    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copiedArr = copyArray(arr);
        for (int i : copiedArr) {
            System.out.println(i);
        }
    }
}
