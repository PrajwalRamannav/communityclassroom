package com.prajwal;

public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting : Type Casting is used when you want explicitly to change bigger data type to smaller one
        // example :
        float a = (int)200.123f;
        System.out.println(a);

        int b = (char)'A'; // this gives value = 65 because ASCI value of 'A' = 65;
                           // Java Follows "Unicode Principle for all languages"
        System.out.println(b);

        // Unicode Principle examples :
        System.out.println("ಕನ್ನಡ");
        System.out.println("English");
        System.out.println("हिंदी");
    }
}
