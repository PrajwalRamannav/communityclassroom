import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find out is it a prime number : ");
        int n = in.nextInt();
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    static boolean isPrime(int n) {
        boolean isprime = true;
        int c = 2; // c = 2
        while (c < n) { // c = 2 < n = 7
            if (n % c == 0) { // 7 % 2 != 0, 7 % 3 != 0, 7 % 4 != 0, 7 % 5 != 0, 7 % 6 != 0;
                return false;
            }
            c++; // 2, 3, 4, 5, 6
        }
        if (c > n){ // c = 7
            return true;
        }
        return isprime;
    }
}
