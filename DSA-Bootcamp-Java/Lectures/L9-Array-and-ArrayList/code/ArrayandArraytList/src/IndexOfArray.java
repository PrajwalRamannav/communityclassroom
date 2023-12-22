public class IndexOfArray {
    public static void main(String[] args) {
        int[] index = {1, 2, 3, 4, 5};
        System.out.println(index[0]); // => 1
        System.out.println(index[1]); // => 1
        System.out.println(index[2]); // => 1
        System.out.println(index[3]); // => 1
        System.out.println(index[4]); // => 1

        System.out.println();

        // In case of Empty Array what will be the output : let's try
        // Empty Array of Integers :
        int[] emptyI = new int[5];
        System.out.println(emptyI[0]);
        System.out.println(emptyI[1]);
        System.out.println(emptyI[2]);
        System.out.println(emptyI[3]);
        System.out.println(emptyI[4]);

        System.out.println("For empty array of integers => by default 0 will be the value => [0, 0, 0, 0, 0]");

        System.out.println();

        // Empty Array of Integers :
        String[] emptyA = new String[5];
        System.out.println(emptyA[0]);

        System.out.println(emptyA[1]);
        System.out.println(emptyA[2]);
        System.out.println(emptyA[3]);
        System.out.println(emptyA[4]);

        System.out.println("For empty array of Strings => by default ' null ' will be the output");
    }
}

