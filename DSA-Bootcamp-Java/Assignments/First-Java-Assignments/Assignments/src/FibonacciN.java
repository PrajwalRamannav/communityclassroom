import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
//      To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter which nth fibonacci seeries number you want find : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Definition => Fibonacci number : It is a number seeries have 0 nd 1 as first two fibonacci numbers
        //                             and further numbers are derived by adding two preceeding numbers
        //                             ex:- 0, 1, (0+1)=1, 2, 3, 5, 8, 13, 21, 34, .......
        // Logic => a = 0, b = 1, c = a + b ==> a = b, b = c

        int a = 0;
        int b = 1;
        int c;
        int count = 2;
        while (count <= n){
            c = b + a;
            a = b;
            b = c;
            count++;
        }
        System.out.println(b);

    }
}
