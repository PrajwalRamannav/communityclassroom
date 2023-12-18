package com.easy;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Volume Of cylinder => v = pi * r^2 * h
        double radius = 20;
        double height = 50;
        double volume = Math.PI * (radius * radius) * height;
        System.out.println(volume);
    }
}
