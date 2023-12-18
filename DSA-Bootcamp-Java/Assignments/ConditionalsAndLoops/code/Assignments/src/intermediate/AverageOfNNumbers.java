package intermediate;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        // average of n number = sum of n numbers / total number of n numbers
        System.out.println("Enter order of integer to find its average : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // ex: n = 1, 2, 3 ... => sum of n number = 1 + 2 + 3 + ....
        //                     => sum of n number = 3
        //                     => average = sum of n number / sum of n number
        int a;
        int sum = 0;
        int count = 1;

        while (count <= n) {
            a = in.nextInt();
            sum += a;
            ++count;
        }
        int average = sum / n;
        System.out.println(average);
    }
}
