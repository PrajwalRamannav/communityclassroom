public class MethodOverloading {
    public static void main(String[] args) {
        fun(1);
        fun("Prajwal R V");
        fun(1, "Prajwal R V");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a, String b){
        System.out.println(a + " " + b);
    }

}
// Function OverLoading :
// -> Function OverLoading happens when two or more functions exists with the same name

// Rules for Function OverLoading :
// -> Two or more functions with same name can exixts if their parameters are different
// -> And also with different number of arguments with the same function name can be existed
// -> And also same number of arguments but different parameters