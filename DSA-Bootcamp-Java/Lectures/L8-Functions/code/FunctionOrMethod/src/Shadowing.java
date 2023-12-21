public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 50;
        System.out.println(x); // At line four lower level var x is Shadowing(masked) the upper level var x;
        /*
            int x;
            System.out.println(x); // Printing before declaration gives error
            x = 20;
        */
    }
    static void fun() {
        System.out.println(x);
    }
}
//  Shadowing :
//  -> When you define var inside public class block,
//     The var x will be available to everything inside the public class block

//  -> You can again initialise x inside the function block
//     At this instance shadowing occurs
//     At line 4 you can see