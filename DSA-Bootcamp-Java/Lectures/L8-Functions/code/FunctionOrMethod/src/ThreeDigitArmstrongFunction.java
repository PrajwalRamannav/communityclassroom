import java.util.Scanner;

public class ThreeDigitArmstrongFunction {
    public static void main(String[] args) {
        // Armstrong number
//        System.out.print("Enter a number to check is it a Armstrong number or not : ");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));
        for (int i = 100; i <= 1000; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        // Armstrong -> 153 = 1^3 + 5^3 + 3^3 == 153 Armstrong
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n= n / 10;
        }
        return (sum == original);
    }

}
