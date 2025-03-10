package Arrays;
public class MinMaxArray {
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = findMinMax(arr);
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}
