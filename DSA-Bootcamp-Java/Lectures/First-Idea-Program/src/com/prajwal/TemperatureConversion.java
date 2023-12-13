package com.prajwal;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("Please enter the temperature of your room in degree celsius : ");
        Scanner in = new Scanner(System.in);
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("The temperature conversion is " + tempF + " degree Fahrenheit");
    }
}
