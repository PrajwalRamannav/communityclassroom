package com.prajwal;

import java.util.Scanner;

public class Input_SumOfTwoNo {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to get sum of them :");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 value : ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 value : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of number " + num1 + " and " + num2 + " is = " + sum);
    }
}
