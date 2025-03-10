package Arrays;

public class ContainsElements {
    public static boolean contains(int[] arr, int val1, int val2) {
        boolean foundVal1 = false;
        boolean foundVal2 = false;
        for (int i : arr) {
            if (i == val1) {
                foundVal1 = true;
            }
            if (i == val2) {
                foundVal2 = true;
            }
        }
        return foundVal1 && foundVal2;
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45};
        System.out.println(contains(arr, 12, 23));
    }
}
