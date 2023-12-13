package com.prajwal;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        // Type Conversion : Whenever one type of data is assigned to another variable of different data type
        //                   automatic type conversion takes based below two conditions set
        // Conditions : 1 -> Both of the data types should be compactible :
        //                   ex:- you assign "String" to another int variable then it will give error
        //              2 -> Always Destination data type > Source data type :
        //                   ex:- float a = 10;
        //                              a - float data type - Destination Data type
        //                              10 - int data type - Source Data type
        //                         output : 10.0

        // see conversion example below :

        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        System.out.println(a);

    }
}
