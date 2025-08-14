import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    rotate(arr, k);
        System.out.println(Arrays.toString(arr));
}
//nums = [1, 2, 3, 4, 5, 6, 7]
//k = 3
//n = 7
//    k = k % n; // 3 % 7 = 3
public static void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;

    reverse(nums, 0, n - 1);     // Step 1: Reverse entire array
    reverse(nums, 0, k - 1);     // Step 2: Reverse first k elements
    reverse(nums, k, n - 1);// Step 3: Reverse rest
}
    private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];      // save the start element
        nums[start] = nums[end];     // put the end element in the start position
        nums[end] = temp;            // put the saved start element at the end
        start++;                     // move the start pointer forward
        end--;                       // move the end pointer backward
    }
}
}
