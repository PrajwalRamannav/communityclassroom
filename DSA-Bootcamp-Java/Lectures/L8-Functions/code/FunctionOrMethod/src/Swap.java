public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap code
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b + " value is swapped");

        // Swap function call
        swap(a, b);

        String name = "Prajwal R V";
        changeName(name);
        System.out.println(name);

    }
    // Let's try same swapping through function :
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b + " value is not swapped");
    }
    // let's see internal working of swap
    // will explain by passing example :
    static String changeName(String naam) {
         naam = "Kunal Kushwaha";
         return naam;

        // when you call the function changeName(name),
        // "Prajwal R V" is passed over the name that will be replaced by naam
        // name -----> "Prajwal R V"
        // naam -----> "Prajwal R V"

        //  When u give print naam then new ibject is created
        // name -----> "Prajwal R V"
        // naam -----> "Kunal Kushwaha"
    }
}
