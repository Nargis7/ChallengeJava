import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3; // square matrix (3x3)
        int[][] arr = new int[n][n];

        System.out.println("Enter " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0, secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];               // Primary diagonal
            secondarySum += arr[i][n - 1 - i];     // Secondary diagonal
        }

        int totalSum = primarySum + secondarySum;

        // If n is odd, subtract middle element (it got added twice)
        if (n % 2 == 1) {
            totalSum -= arr[n / 2][n / 2];
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
        System.out.println("Total Diagonal Sum = " + totalSum);
    }
}

