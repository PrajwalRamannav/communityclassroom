package intermediate;

import java.util.Scanner;

public class SubstractProductsAndSumOfDigitsOfNumber {
    public static void main(String[] args) {
        // [Subtract the Product and Sum of Digits of an Integer]
        // int n = 123;
        // int product = 1 * 2 * 3; // product = 6
        // int sum = 1 + 2 + 3;    // sum = 6
        // int substract = product - sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check the above program[SubstractProductsAndSumOfDigitsOfNumber] :  ");
        int n = in.nextInt();

        int product = 1;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10; //
            product *= rem;
            temp /= 10;
        }
        System.out.println(product);

        int sum = 0;
        while (n > 0) {
            int mod = n % 10;
            sum += mod;
            n = n / 10;
        }
        System.out.println(sum);

        int substract = product - sum;
        System.out.println(substract);
    }
}
