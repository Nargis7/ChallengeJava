public class CheckIfArraySorted {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,4,3,6};

        System.out.println(isSorted(arr1, arr1.length)); // true
        System.out.println(isSorted(arr2, arr2.length)); // false

    }
    public static  boolean isSorted(int[] arr, int n){

//        base case
         if(n == 0 || n == 1) return  true;

         if(arr[n-2] > arr[n-1]) return  false;

         return isSorted(arr, n-1);
    }
}
