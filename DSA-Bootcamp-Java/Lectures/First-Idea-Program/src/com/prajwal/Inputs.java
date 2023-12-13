package com.prajwal;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Scanner -> it is a in-built class used to take inputs
        // Scanner() -> is used to see where is inputs are took from
        //System.in -> from system (.in) -> keyboard

        // Let's Try taking inputs from user :

        // Input of integers
        System.out.print("Enter number : ");
        int num = input.nextInt();
        System.out.println(num);

        // Input of strings :
        System.out.print("Enter string : ");
        String name = input.next(); // This only take string till first space after first space it will not take
        System.out.println(name);

        System.out.println(" ");

        System.out.print("Enter string 2 : ");
        String name2 = input.nextLine(); // This take whole strings
        System.out.println(name2);

        // Input of boolean expressions :
        System.out.print("Enter true expression : ");
        boolean yes = input.nextBoolean();
        System.out.println(yes);
        System.out.print("Enter false expression : ");
        boolean no = input.nextBoolean();
        System.out.println(no);

    }

}
