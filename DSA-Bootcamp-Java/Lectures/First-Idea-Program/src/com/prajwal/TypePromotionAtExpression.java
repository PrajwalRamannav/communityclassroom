package com.prajwal;

public class TypePromotionAtExpression {
    public static void main(String[] args) {
        // Automatic Type Promotion in Expression :
        // Rules : 1 -> All the byte, short, char values are promoted to integer
        //         2 -> Then any one operand is long whole expression will be promoted to long
        //              Then any one operand is double whole expression will be promoted to double
        //              Then any one operand is float whole expression will be promoted to float

        // Example :

        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c; // here byte can only store upto 256(max) but (40*50) = (2000); byte cannot store
                           // So to handle this java automatically promotes each byte to int at the evaluation of expression
        System.out.println(d);
    }
}
