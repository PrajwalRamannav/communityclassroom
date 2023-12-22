import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> MultiDimenionalArray = new ArrayList<>();

        // Initialisation :
        for (int i = 0; i < 3; i++) {
            MultiDimenionalArray.add(new ArrayList<>());
        }

        // Add element :
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                MultiDimenionalArray.get(row).add(in.nextInt());
            }
        }
        System.out.println(MultiDimenionalArray);
    }
}
