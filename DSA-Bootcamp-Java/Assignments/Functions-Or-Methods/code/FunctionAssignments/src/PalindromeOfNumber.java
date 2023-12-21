import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        // Write a function to find if a number is a palindrome or not. Take number as parameter.
        System.out.print("Enter a number to check is it a palindrome number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPalindrome = isPalindrome(n);
        System.out.println(isPalindrome);
    }
    static boolean isPalindrome(int n){
        boolean Palindrome = true;
        int rev = 0;
        int original = n;

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n /  10;
        }
        return (rev == original);

    }
}
