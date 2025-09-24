import java.util.Scanner;

public class MaxRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        matrix
        int rows = 3 , cols = 3;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter " + rows + "x" + cols + " matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;
//        row sum calculation
        for(int i=0; i<rows; i++){
            int sum = 0;
            for(int j=0; j<cols; j++){
                sum += arr[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
            if( sum > maxSum){
                 maxSum = sum;
                maxRowIndex = i;
            }
        }
        System.out.println("Maximum Row Sum = " + maxSum + " at Row " + maxRowIndex);

    }
}
// output
/*
Enter 3x3 matrix:
1 2 3
4 5 6
7 8 9
Row 0 sum = 6
Row 1 sum = 15
Row 2 sum = 24
Maximum Row Sum = 24 at Row 2

*/