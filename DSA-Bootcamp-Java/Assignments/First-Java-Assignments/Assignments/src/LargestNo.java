import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
//      Take 2 numbers as input and print the largest number.
        System.out.println("Enter two number to find which is maximum : ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 value : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 value : ");
        int num2 = in.nextInt();

        // Logic => consider num1 = max, if num2 > max then max = num2 print max
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        System.out.println(max + " is the largest number");
    }
}
