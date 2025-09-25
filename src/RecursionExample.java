public class RecursionExample {
    public static void main(String[] args) {
        printNums(4);

    }
    public static void printNums(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printNums(n-1);
    }
}
