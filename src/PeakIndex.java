public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 5, 3, 1};
//        System.out.println(index(arr));
        int peakIdx = index(arr);
        System.out.println("Peak index: " + peakIdx);       // Output: 3
        System.out.println("Peak value: " + arr[peakIdx]);   // Output: 6
    }
    public  static int index(int[] arr){
        int start = 1;
        int end = arr.length-2;
        while(start<=end){
            int mid = start + (end-start) /2;
            if(arr[mid-1]<arr[mid] && arr[mid] >arr[mid+1]) {
                return mid;
            }else if(arr[mid-1] < arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
