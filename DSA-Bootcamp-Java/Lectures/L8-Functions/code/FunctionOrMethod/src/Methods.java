import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Methods {
    public static void main(String[] args) {
        // functions or Methods
        // Methods : when a functions inside the class are described as Methods in java

        // Syntax of function || method :
        // return_type name (arguments) {
        //      //body
        // }
        // calling a function || method
        // name();

        // Example Question :
        // Q : Take input of two numbers and print the sum?
        sum();

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1 and num2 value : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}