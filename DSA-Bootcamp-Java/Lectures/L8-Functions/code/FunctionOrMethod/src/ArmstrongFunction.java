import java.util.Scanner;

public class ArmstrongFunction {
    public static void main(String[] args) {
        // Armstrong number
        System.out.print("Enter a number to check is it a Armstrong number or not : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        // Armstrong -> 153 = 1^3 + 5^3 + 3^3 == 153 Armstrong
        int original = n; // we use n again and again to extract the last digit
        int sum = 0;

        while (n > 0) {
            int rem = n % 10; // 153 -> 3, 15 -> 5, 1;
            sum = sum + rem*rem*rem; // 0 + 3*3*3 = 27, 27 + 125 = 152, 152 + 1*1*1 = 153;
            n= n / 10; // 153 / 10 = 15, 15 -> 1, 1 / 10 = 0;
        }
        return (sum == original);
    }
}
