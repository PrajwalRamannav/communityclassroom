import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // Program 2 : Display Day Name b/w  1 & 7 :

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number b/w 1 - 7 to check which day it is : ");
        int Day = in.nextInt();

        switch (Day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number");
        }
    }
}
