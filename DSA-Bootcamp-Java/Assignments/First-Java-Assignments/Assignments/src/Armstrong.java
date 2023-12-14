import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the the number to check is it a Armstrong Number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Logic => if 153 = 1^3 + 5^3 + 3^3 = 153 then it is an Armstrong number
        int temp = n;
        int order = Integer.toString(n).length(); // to get order or no total digits in a number
        double power = order;
        double extract;
        double Armstrong = 0;
        for (double i = 1; i <= order; i++) {
            extract = temp % 10;
            temp = temp / 10;
            Armstrong += Math.pow(extract, power);
        }

        if (Armstrong == n) {
            System.out.println(n + " is a Armstrong number");
        } else {
            System.out.println(n + " is not a Armstrong number");
        }

    }
}
