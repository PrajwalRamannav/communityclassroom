import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array {
    public static void main(String[] args) {
        // What is Array?
        // Why we need Array?
        // What is the Syntax of Array?

        // Let's understand by taking questions :

        // Q: Store a roll number :
        int a = 19;

        // Q: Store a person name :
        String name = "Prajwal R V";

        //Now
        // Q: Store 5 Roll Number :
        int A = 1;
        int c = 2;
        int d = 2;
        int e = 2;
        int f = 2;

        //Now
        // Q: Store 500 Roll Number :
        // Now are you going to initialise 5000 times?
        // NO :
        // For this problem Araay is a Time Saver [datatype] for us
        // that can store a list of datatype

        // Syntax of Array :
        // DataType[] varName = new DataType[Size];

        // example :
        int[] arr = new int[5]; // Here array is declared in 'stack memory'[Compile time]
                                // and initialised 'in heap memory'[Run time] - DMA(Dynamic Memory Allocation)
        // Another way of declaring and initialising array
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr2));
    }
}