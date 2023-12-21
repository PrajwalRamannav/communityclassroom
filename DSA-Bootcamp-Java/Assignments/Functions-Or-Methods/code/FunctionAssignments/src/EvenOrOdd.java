import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Define a program to Define a program to find out whether a given number is even or odd..
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find out whether a given number is even or odd : ");
        int n = in.nextInt();
        boolean even = iseven(n);
        if (even){
            System.out.println(n + " is a even number");
        } else {
            System.out.println(n + " is not a even number");
        }
    }
    static boolean iseven(int n) {
        return (n % 2 == 0);
    }
}
