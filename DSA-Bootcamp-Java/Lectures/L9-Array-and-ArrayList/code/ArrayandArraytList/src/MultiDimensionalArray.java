import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // MultiDimensional Array :
        // 2D Array

        /*
            1 2 3
            4 5 6
            7 8 9
        */
        Scanner in = new Scanner(System.in);
        // Hard way of input :
//        int[][] MultiDimensionArray= {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//        System.out.print(Arrays.toString(MultiDimensionArray));

        // Input

        int[][] MultiDimensionArray = new int[3][3];  // Good syntax
        for (int row = 0; row < MultiDimensionArray.length; row++) {
            // for each column in every row :
            for (int col = 0; col < MultiDimensionArray[row].length;col++) {
                MultiDimensionArray[row][col]  = in.nextInt();
            }
        }

        // Printing :

        for (int row = 0; row < MultiDimensionArray.length; row++) {
            // for each column in every row :
            for (int col = 0; col < MultiDimensionArray[row].length;col++) {
                System.out.print(MultiDimensionArray[row][col] + " ");
            }
            System.out.println(); // to bring into matrix form
        }
    }
}
