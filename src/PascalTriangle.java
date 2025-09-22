import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printPascalTriangle(rows);
        sc.close();
    }
//    method to calculate factorial
    static int factorial(int n){
        if (n==0) return 1;
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    static int ncr(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }
//    methods to print pascals
    static  void printPascalTriangle(int rows){
        for(int i=0;i<rows;i++){
//            print leading spcaes
            for(int space=0;space<rows-i;space++){
                System.out.print(" ");
            }
//            print numbers
            for(int j=0;j<=i;j++){
                System.out.print(ncr(i,j) + " ");
            }
            System.out.println();
        }
    }
}
