import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListINJava {
    public static void main(String[] args) {
        // What if you don't know the size of Array?
                        // OR \\
        // Hey Java Please handle the size for me and let me input any number of element :
        // ^ For these cases we use 'ArrayList' :

        // Syntax of Array List :
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(100);
//        list.add(200);
//        list.add(300);
//        list.add(400);
//        list.add(500);
//
//        System.out.println(list);
//
//        // Updating the list
//        System.out.println("Checking the list : ");
//
//        System.out.println(list.contains(500));
//
//        System.out.println("Changing the value in a list : ");
//
//        list.set(0, 600);
//        System.out.println(list);
//
//        System.out.println("Removing the value in a list : ");
//
//        list.remove(0);
//        System.out.println(list);

        // Input :
        Scanner in = new Scanner(System.in);
        for (int i =0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);


    }
}
