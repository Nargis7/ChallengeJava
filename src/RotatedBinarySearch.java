
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(nums,target);
        System.out.println("Element at index: " + result);
    }
    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end-start) /2;
            if(nums[mid]==target){
                return mid;
            }
//            left half is sorted
            if(start<=nums[mid]){
                if(target >=nums[start] && target < nums[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
//            right half is sorted
            else{
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
