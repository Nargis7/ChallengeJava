public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67,90};
        int m=2;
        System.out.println("Minimum Maximum Pages: " + allocateBooks(arr,m));
    }
    public static int allocateBooks(int[] arr, int m){
        if(m>arr.length) return -1;
        int start = Integer.MIN_VALUE;
        int end =0;

//        initialize start(max book pages) and end(sum of pages)
        for(int pages:arr){
            start = Math.max(start,pages);
            end +=pages;
        }
        int result = -1;
        while(start<=end){
            int mid = start + (end-start) /2;
            if(isPossible(arr,m,mid)){
                result = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return result;
    }
//    method to check allocation
    public static boolean isPossible(int[] arr, int m, int maxPages){
        int studentCount = 1;
        int pagesSum = 0;

        for(int pages : arr){
            if(pagesSum + pages > maxPages){
                studentCount ++;
                pagesSum = pages;
                if(studentCount >m)
                    return false;
            }else{
                pagesSum += pages;
            }
        }
        return  true;
    }
}
