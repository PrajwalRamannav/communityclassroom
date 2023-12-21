public class returnType {
    public static void main(String[] args) {
        // Return_type in java is just when you call the function
        // -> the function call will have value after the execution
        // and the data type of that return statement is known as return_type.


        String Name = name();
        System.out.println(Name);

        int Number = number();
        System.out.println(Number);

    }
    // Example : return a string
    static String name() {
        String name = "Prajwal R V";
        return name;
    }

    // Example : return a integer
    static int number() {
        int a = 10;
        int b = 20;
        int number = a + b;
        return number;
    }
}
