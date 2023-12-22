import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Lets see :
        int[] input = new int[5];
//        input[0] = 1;
//        input[1] = 1;
//        input[0] = 1;
//        input[0] = 1;
        // Just think you now have to store 100 values are gonna initialise each one
        // No right to do that in effective way we ise For loop

        // Input ways :
        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextInt();
        }

        System.out.println("Printing way 1 : Easiest");

        // Printing way 1 ->
        System.out.println(Arrays.toString(input));

        System.out.println("Printing way 2 : ");

        // Printing way 2 -> for loop :
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }

        System.out.println();

        System.out.println("Printing way 3 : ");

        // Printing way 3 -> for each loop : [Enhanced for loop]
        for (int nums : input) { // for each element in input array;
            System.out.print(nums + " "); // print elements of array;
        }
    }
}
