import java.util.Scanner;

public class PrimeFunction {
    public static void main(String[] args) {
        // Pseudocode :
        // start -> input n -> int div = 2 ->
        // if (div < n) -> Yes -> n % div == 0 -> yes -> print not prime
        //                                        no -> div = div + 1
        //              -> No -> print prime

        isPrime();
    }

    static boolean isPrime() {
        System.out.print("Enter a number to check is it a prime number or not : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPrime = true;
        int c = 2;
        while (c < n){
            if (n % c == 0){
                isPrime = false;
            }
            c++;
        }
        if (c > n){
            isPrime = true;
        }
        if (isPrime){
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        return isPrime;
    }
}
