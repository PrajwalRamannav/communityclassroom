import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch {
    public static void main(String[] args) {
        // Switch and Nested Switch Cases :
        // before know switch statements, let's take a question
        // Q :- Take input as fruit and print respective message for particular fruits :

        // What we do is using if statements we can do this as followed :-
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // for condition like one ref var and different objects use '.equals()'
        // for condition like one different var and same || different objects use '=='
//        if (fruit.equals("Mango")){
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("Apple")){
//            System.out.println("A sweet red fruit");
//        }
//        if (fruit.equals("Orange")){
//            System.out.println("A bright coloured fruit");
//        }

        // See the repeation of same syntactical code is looking ugly right?
        // To avoid this let's Introduce Switch statement

        // Syntax :
        // switch(Expression) {
        //      case 1:
        //           body
        //           break;
        //      case 2:
        //           body
        //           break;
        //      case 3:
        //           body
        //           break;
        //      case 4:
        //           body
        //           break;
        //      default:
        //           body
        // }

        // Example as fruit question itself :

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A bright coloured fruit");
                break;
            default:
                System.out.println("Invalid fruit input");
        }
    }
}