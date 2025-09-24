import java.util.Scanner;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];


//        input
        System.out.println("Enter 3X3 matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        target element
        System.out.print("Enter target element to be searched: ");
        int target = sc.nextInt();

//        output
        boolean found = false;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j] == target){
                    System.out.println("Element " + target + " found at position (" + i + ", " + j + ")");
                   found  = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
