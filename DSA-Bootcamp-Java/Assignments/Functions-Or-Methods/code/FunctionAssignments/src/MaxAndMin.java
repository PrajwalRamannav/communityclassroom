import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaxAndMin {
    public static void main(String[] args) {
        // Define two methods to print the maximum and the minimum number
        // respectively among three numbers entered by the user.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num1 : ");
        int num2 = in.nextInt();
        System.out.print("Enter num1 : ");
        int num3 = in.nextInt();
        int max = isMax(num1, num2, num3);
        int min = isMin(num1, num2, num3);
        System.out.println(max + " is the maximum value");
        System.out.println(min + " is the minimum value");
    }

    static int isMax(int num1, int num2, int num3){
       int max = num1;
       if (num2 > max) {
           max = num2;
       }
       if (num3 > max) {
           max = num3;
       }
       return max;
    }
    static int isMin(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

}