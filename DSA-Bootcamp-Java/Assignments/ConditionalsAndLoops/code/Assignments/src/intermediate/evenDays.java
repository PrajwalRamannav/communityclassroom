package intermediate;

import java.util.Scanner;

public class evenDays {
    public static void main(String[] args) {
        // Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.

        // Algorithm :-
        // Step 1 : even days in a month calculated by using modulus operation
        //          even number is said to be completely divisible by 2 .'. n % 2 == 0 : even
        // Step 2 : Keep the count of even days so that we can solve this assignment

        // Even days code :
        System.out.println("Hey kunal would you like to know how many days that you can go out and meet your friends in a given month : ");
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first three leters of month you want (smaller case) : ");
        String month = in.nextLine();
        if (month.equals("jan")) {
            int jan = 31;
            int count = 0;
            for (int i = 1; i <= jan; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        } else if (month.equals("feb")) {
            int feb = 29;
            int count = 0;
            for (int i = 1; i <= feb; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        } else if (month.equals("mar")) {
            int mar = 31;
            int count = 0;
            for (int i = 1; i <= mar; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        } else if (month.equals("apr")) {
            int apr = 30;
            int count = 0;
            for (int i = 1; i <= apr; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("may")) {
            int may = 31;
            int count = 0;
            for (int i = 1; i <= may; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("jun")) {
            int jun = 30;
            int count = 0;
            for (int i = 1; i <= jun; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("jul")) {
            int jul = 31;
            int count = 0;
            for (int i = 1; i <= jul; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("aug")) {
            int aug = 31;
            int count = 0;
            for (int i = 1; i <= aug; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        } else if (month.equals("sep")) {
            int sep = 30;
            int count = 0;
            for (int i = 1; i <= sep; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("oct")) {
            int oct = 31;
            int count = 0;
            for (int i = 1; i <= oct; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("nov")) {
            int nov = 30;
            int count = 0;
            for (int i = 1; i <= nov; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else if (month.equals("dec")) {
            int dec = 31;
            int count = 0;
            for (int i = 1; i <= dec; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("You have " + count + " days day out options in the month of " + month);
        }else {
            System.out.println("Invalid entry");
        }
    }
}
