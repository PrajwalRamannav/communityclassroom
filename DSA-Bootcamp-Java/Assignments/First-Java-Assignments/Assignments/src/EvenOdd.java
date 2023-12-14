import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //      Write a program to print whether a number is even or odd, also take input from the user.

        System.out.print("Enter a number to check it is even number or odd number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Logic -> if a number is completely divisible by 2 is "EVEN", if not then "ODD"
        if(n % 2 == 0){
            System.out.println(n + " is even number");
        }
        if (n % 2 != 0){
            System.out.println(n + " is odd number");
        }
    }
}
