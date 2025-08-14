public class MovesZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveZeros(int[] arr) {
        int j = 0; // position for next non-zero

        // Step 1: Place all non-zero elements at the start
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}
