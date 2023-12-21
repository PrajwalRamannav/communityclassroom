import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        // Write a program to print the circumference and area of a circle of
        // radius entered by user by defining your own method.

        // Algorithm :
        // Area of circle : Math.PI * (radius * radius);
        // Circumference of circle : 2 * Math.PI * radius;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of given circle and find out its Area and Circumference: ");
        double radius = in.nextInt();
        Area(radius);
        Circumference(radius);

    }
    static void Area(double radius) {
        double area = Math.PI * (radius * radius);
        System.out.println("Area of circle is  = " + area);
    }
    static void Circumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle is  = " + circumference);
    }
}
