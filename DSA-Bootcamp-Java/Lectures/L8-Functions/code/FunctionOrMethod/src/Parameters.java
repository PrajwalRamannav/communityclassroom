public class Parameters {
    public static void main(String[] args) {
        // When you dont want to write scann again and again
        // and when you want to give arguments while calling the function

        // Example :
        int ans = sum(1, 2);
        System.out.println(ans);
    }
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
