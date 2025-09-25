public class SumOfN {
    static int sum(int n) {
        if (n == 0) return 0; // base case
        return n + sum(n - 1); // recursion
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Sum of first " + N + " numbers is: " + sum(N));
    }
}
