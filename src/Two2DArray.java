import java.util.Scanner;

public class Two2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        create a 2d array with 3 rows and 3 columns
        int[][] arr = new int[3][3];

//        input
        System.out.println("Enter 3X3 Matrices");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//      output
        System.out.println("Matrix is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
