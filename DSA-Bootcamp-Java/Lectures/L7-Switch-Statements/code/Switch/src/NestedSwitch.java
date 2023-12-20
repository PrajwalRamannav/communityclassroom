import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // Nested Switch : Is just Switch case inside a Switch case :

        // Example :

        Scanner in = new Scanner(System.in);
        System.out.print("Enter EmpID number : ");
        int EmpID = in.nextInt();
        String Department = in.next(); // cannot use nextLine() & why : ?

        switch (EmpID) {
            case 1:
                System.out.println("Prajwal R V");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("EmpID number 3");
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default:
                System.out.println("Invalid EmpID");
        }

    }
}
