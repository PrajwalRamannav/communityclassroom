package intermediate;

import java.util.Scanner;

public class SumOfNegativeAndPositive {
    public static void main(String[] args) {
        // Write a program to print the sum of negative numbers, sum of positive even numbers
        // and the sum of positive odd numbers from a list of numbers (N) entered by the user.
        // The list terminates when the user enters a zero.

        // Algorithm :-
        //           Step 1 -> take input as integers and stop taking input if user enters 0
        //           Step 2 -> perform adding all the negative numbers
        //           Step 3 -> perform adding all the Positive even numbers
        //           Step 4 -> perform adding all the Positive odd numbers
        //

        System.out.println("Please enter your each numbers one by one : ");
        Scanner in = new Scanner(System.in);

//        do  {
//            n = in.nextInt();
//        } while (n > 0);

        int n;

        int sumOfNegative = 0;
        int sumOfPositiveEvene = 0;
        int sumOfPositiveOdd = 0;

        while (true) {
            n = in.nextInt();
            if (n < 0) {
                sumOfNegative += n;
            } else if (n > 0 && n % 2 == 0) {
                sumOfPositiveEvene += n;
            } else if (n > 0 && n % 2 == 1) {
                sumOfPositiveOdd += n;
            }
            int temp = n;
            if (temp == 0) {
                break;
            }
        }
        System.out.println("Sum of given negative number = " + sumOfNegative);
        System.out.println("Sum of given Positive even number = " + sumOfPositiveEvene);
        System.out.println("Sum of given Positive odd number = " + sumOfPositiveOdd);
    }
}
