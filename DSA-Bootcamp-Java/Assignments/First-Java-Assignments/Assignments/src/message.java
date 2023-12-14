import java.util.Scanner;

public class message {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        System.out.print("Enter your name to read a greeting message sent for you : ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        // Logic => take name and print name with message
        System.out.println("Happy birthday " + name);
    }
}
