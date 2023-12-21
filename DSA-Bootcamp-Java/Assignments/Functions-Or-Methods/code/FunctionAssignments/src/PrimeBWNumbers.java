import java.io.PrintStream;
import java.util.Scanner;

public class PrimeBWNumbers {
        // Function to check if a number is prime
        static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Function to print prime numbers between given range
        static void printPrimeNumbers(int start, int end) {
            System.out.println("Prime numbers between " + start + " and " + end + " are:");
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            int start = 2; // Replace with your start number
            int end = 10;   // Replace with your end number

            printPrimeNumbers(start, end);
        }
}
