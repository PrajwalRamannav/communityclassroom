import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        // Input
//        Scanner in = new Scanner(System.in);
//
//        int[][] MultiDimensionArray = new int[3][3];  // Good syntax
//        for (int row = 0; row < MultiDimensionArray.length; row++) {
//            // for each column in every row :
//            for (int col = 0; col < MultiDimensionArray[row].length;col++) {
//                MultiDimensionArray[row][col]  = in.nextInt();
//            }
//        }
//        System.out.println();

        int[][] MultiDimensionArray= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing :
        System.out.println("Printing way 1 :");

        for (int row = 0; row < MultiDimensionArray.length; row++) {
            // for each column in every row :
            for (int col = 0; col < MultiDimensionArray[row].length;col++) {
                System.out.print(MultiDimensionArray[row][col] + " ");
            }
            System.out.println(); // to bring into matrix form
        }
        System.out.println();
        System.out.println("Printing way 2 :");

        // Enhanced for loop to for each loop
        for(int[] a: MultiDimensionArray) {
            for (int col = 0; col < a.length; col++){
                System.out.print(a[col] + " ");
            }
            System.out.println();
        }
    }
}
