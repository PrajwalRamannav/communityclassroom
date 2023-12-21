import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        add(1, 2, 3, 4, 5, 6);
        multiple(1, 2, "Prajwal R V");
    }
    static void add(int ...v){
        System.out.println(Arrays.toString(v));
    }
    // Multiple arguments
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);
    }
}
// Variable Length Arguments :
// -> If you want to pass integer and you don't know how many integers you are going to pass
//    At this instance VarArgs is used

// When you want to have mix of arguments VarArgs helps you
// But you cannot do like below in case of mix arguments
// static void mix(int a, int ..v, int b){
//    we cannot know when u going to pass value of b because arry of v is conflicting b value every single time
// }
