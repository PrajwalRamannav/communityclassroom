import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        /* Write a program that will ask the user to enter his/her marks (out of 100).
        Define a method that will display grades according to the marks entered as below:
            Marks        Grade
            91-100         AA
            81-90          AB
            71-80          BB
            61-70          BC
            51-60          CD
            41-50          DD
            <=40          Fail
        */
        System.out.print("Enter the marks you obtained out of 100 : ");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        grades(marks);


    }
    static String grades(int marks) {
        String grade = " ";
        if (marks > 91 && marks <= 100) {
            grade = "Excellent You got grade : AA ";
        } else if (marks > 81 && marks <= 90) {
            grade = "Very  AB";
        } else if (marks > 71 && marks <= 80) {
            grade = "Good You got grade : BB";
        } else if (marks > 61 && marks <= 70) {
            grade = "Good You got grade : BC Not Bad";
        } else if (marks > 51 && marks <= 60) {
            grade = "You got grade : CD Bad, Improvise";
        } else if (marks > 41 && marks <= 50) {
            grade = "You got grade : DD You are in border";
        } else if (marks < 40) {
            grade = "Fail Don't loose hope";
        }
        System.out.println(grade);
        return grade;
    }
}
