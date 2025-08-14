public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,70,80};
        int target = 70;
        int result = searchElement(arr,target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("ELement found at index: " + result ); //4
            System.out.println("Elemnt index value: " + arr[result]);//70
        }
    }
    public static int searchElement(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
