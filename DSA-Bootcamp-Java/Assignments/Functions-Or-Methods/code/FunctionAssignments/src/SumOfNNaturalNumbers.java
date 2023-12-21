import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        NnaturalNumber(n);
    }
    static int NnaturalNumber(int n) {
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
        // or
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//        return sum;
    }
}
