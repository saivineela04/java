package Arrays;

public class EvenOddCount {
    public static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        countEvenOdd(arr);
    }
}
