package loops;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, reverse = 0, remainder, original;
        original = num;
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }
    }
}
