public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,60,70,80};
        int target = 90;
        int result = linearSearch(arr,target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:  " + result);
            System.out.println("Element is: " + arr[result]);
        }


    }

    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
