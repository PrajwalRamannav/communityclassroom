import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        System.out.println("Enter word to know is it a palindrome word : ");
        Scanner in = new Scanner(System.in);
        String word = in.next();

        // Logic => Transverse the string forward and backward if  forward == backward then the word is palindrome
        String fav = "";
        String rev = "";
        for (int i = 0; i < word.length(); i++) {
            fav = fav + word.charAt(i);
        }
        for (int j = word.length() - 1; j >= 0; j--) {
            rev = rev + word.charAt(j);
        }

        if (fav.equals(rev)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}
