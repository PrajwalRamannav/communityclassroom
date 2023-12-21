import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find out sum of them : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        Product(num1, num2);
    }
    static void Product(int num1, int num2) {
        int product = num1 * num2;
        System.out.println(product);
    }
}
