package com.easy;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // Volume Of Sphere => v = (4/3) * pi * r^3;
        double radius = 20;
        double volume = ((double)4 / 3) * Math.PI * (radius * radius * radius);
        System.out.println(volume);
    }
}
