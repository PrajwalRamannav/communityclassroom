import java.util.Scanner;

public class BasicCalaculator {
    public static void main(String[] args) {
        System.out.println("Welcome to your Basic Calculator : ");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1 value : ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2 value : ");
        double num2 = in.nextDouble();
        System.out.print("Enter operator : '+','-','/','*' : ");
        char operator = in.next().charAt(0);

        // Logic => if user enters two numbers and '+' do num1 + num 2
        // Logic => if user enters two numbers and '-' do num1 - num 2
        // Logic => if user enters two numbers and '/' do num1 / num 2 : condition -> but num2 > 0
        // Logic => if user enters two numbers and '*' do num1 + num 2
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result = " + result);
        }
        if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result = " + result);
        }
        if (operator == '/') {
            if (num2 > 0) {
                result = num1 / num2;
                System.out.println("Result = " + result);
            }
            System.out.println("Invalid input");
        }
        if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result = " + result);
        }

    }
}
