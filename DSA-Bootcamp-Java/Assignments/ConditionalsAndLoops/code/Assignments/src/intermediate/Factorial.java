package intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the nuber to do factorial operation : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Factorial => 5! = 5 * 4 * 3 * 2 * 1 = 120
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
