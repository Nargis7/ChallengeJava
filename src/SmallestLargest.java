public class SmallestLargest {
    public static void main(String[] args) {
//        array declaration and initialization
        int[] arr = {10,20,30,40,50,90};
        int max = arr[0];
        int min = arr[0];
//        System.out.print(arr[arr.length-1]);//90 gives last element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            } else{
                min = arr[i];
            }
        }
        System.out.println("Maximum array: " + max); // output:90
        System.out.println("Minimum array: " + min); // output : 10
    }
}
