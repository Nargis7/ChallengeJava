public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};
        int target = 40;
        int result = binarySearch(nums,target);
        if(result==-1){
            System.out.println("element not found ");
        }else {
            System.out.println("Element found at index: " + result);
            System.out.println("Element is: " + nums[result]);
        }

    }
    public static  int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start + (end-start) /2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return  -1;
    }
}
