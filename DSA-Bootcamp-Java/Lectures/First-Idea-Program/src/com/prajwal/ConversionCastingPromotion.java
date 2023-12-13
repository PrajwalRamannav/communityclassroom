package com.prajwal;

public class ConversionCastingPromotion {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'A';
        short s = 1024;
        int i = 25000;
        float f = 25.23f;
        double d = 25.252525;

        double result = ((f * b) + (i / c) + (d - s));
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
