public class InternalWorkingOfArray {
    public static void main(String[] args) {
        int[] arr = new int[5]; // int -> Datatype, arr -> VarName, new -> Keyword, int[5] -> Size of array
        // Now lets break how array works internally :
        int[] arr1; // Declaration happens at 'Stack Memory'
        arr1 = new int[5]; // Initialisation : Here object is created in 'Heap Memory'

        // new -> is used to create object
    }
}
