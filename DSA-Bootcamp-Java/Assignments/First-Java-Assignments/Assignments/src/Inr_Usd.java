import java.util.Scanner;

public class Inr_Usd {
    public static void main(String[] args) {
        System.out.print("Enter indian Rupees to get converted into US Dollars : ");
        Scanner in = new Scanner(System.in);
        float INR = in.nextFloat();

        // Logic => INR -> USD ==> 1 US Dollar = 85 Rupees .'. USD = INR * 85;
        float USD = INR / 85f;
        System.out.println(INR + " Rupees in Indian  is = " + USD + " Dollars in US ");
    }
}
