package com.easy;

public class VolumeOfCone {
    public static void main(String[] args) {
        // Volume Of Cone => V = pi * r^2 * (h / 3)
        double radius = 100;
        double height = 200;
        double volume = Math.PI * (radius * radius) * (height / 3);
        System.out.println(volume);
    }
}
