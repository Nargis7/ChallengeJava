import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want int the fibonacci series: ");
        int n = sc.nextInt();
        int first= 0, second = 1;
        int sum = 0;
        System.out.print("Fibonacci series: ");
        for(int i=1;i<=n;i++){
            System.out.print(first + " ");
            sum +=first; // sum of fibonacci series!
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("\nSum of fibonacci series up to" + n + " terms: " + sum);
        sc.close();
    }
}
