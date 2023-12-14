import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
//      Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println("Welcome to Simple Interest calculator : ");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principle amount : ");
        double P = in.nextDouble();
        System.out.println("Enter the Time in years : ");
        double T = in.nextDouble();
        System.out.println("Enter the Rate of Interest - ROI : ");
        double R = in.nextDouble();

        // Logic => SI = (P * R * T) / 100
        double SI = (P * R * T) / 100;
        System.out.println("The simple interest for the priciple amount of " + P + " is => " + SI);

    }
}
