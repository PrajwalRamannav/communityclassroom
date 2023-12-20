import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch is a syntax of new java feature where it converts old switch syntax to new one in few steps ;

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // to convert the existing switch case to enhanced switch case do below steps :
        // Step 1 :
        // if windows : Alt + Enter
        // if Mac : Option + Enter
        // Step 2 :
        // Click : Replace with enhanced 'switch' statement

        // Old switch Syntax :
//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("A bright coloured fruit");
//                break;
//            default:
//                System.out.println("Invalid fruit input");
//        }

        // Enhanced switch syntax :
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A bright coloured fruit");
            default -> System.out.println("Invalid fruit input");
        }
    }
}
