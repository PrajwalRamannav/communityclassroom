import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        // Program 3 : Weekdays and Weekends
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number b/w 1 - 7 to check is it a Weekday or Weekend : ");
        int Day = in.nextInt();

        switch (Day) {
            case 1, 2, 3, 4, 5 -> System.out.println(Day + " is a Weekday");
            case 6, 7 -> System.out.println(Day + " is a Weekend");
            default -> System.out.println("Invalid Number");
        }
    }
}
