package Arrays;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        int totalSum = 100 * (100 + 1) / 2;
        int arraySum = 0;
        for (int i : arr) {
            arraySum += i;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findMissingNumber(arr));
    }
}
