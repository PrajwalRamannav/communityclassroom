import java.util.Scanner;

public class PythagorianTriplet {
    public static void main(String[] args) {
        // Write a function to check if a given triplet is a Pythagorean triplet or not.
        // (A Pythagorean triplet is when the sum of the square of two numbers
        // is equal to the square of the third number).
        // (a + b)^2 == (c)^2

        Scanner in = new Scanner(System.in);
        System.out.println("Enter three number to check weather these are Pythagorean triplet or not");
        System.out.print("Enter num1 : ");
        double num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        double num2 = in.nextInt();
        System.out.print("Enter num3 : ");
        double num3 = in.nextInt();
        System.out.println(pythagoreanTriplet(num1, num2, num3));


    }

    static boolean pythagoreanTriplet(double num1, double num2, double num3) {
        double num1SQ = Math.pow(num1, 2);
        double num2SQ = Math.pow(num2, 2);
        double num3SQ = Math.pow(num3, 2);
        double sum = num1SQ + num2SQ;
        return (sum == num3SQ);

    }
}
