import java.util.Scanner;

public class VoteEligibility {
    // A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age to find out whether you are eligible to vote : ");
        int n = in.nextInt();
        System.out.print("Enter your gender : ");
        String gender = in.next();
        isEligble(n, gender);


    }
    static void isEligble(int n, String gender) {
        switch (gender) {
            case "male":
                if (n < 18 ) {
                    System.out.println(" He is not elgible to vote, come after you get 18 year old");
                } else{
                    System.out.println(" He is elgible to vote");
                }
                break;
            case "female":
                if (n < 18 ) {
                    System.out.println(" She is not elgible to vote, come after you get 18 year old");
                } else{
                    System.out.println(" She is elgible to vote");
                }
                break;
        }
    }
}
