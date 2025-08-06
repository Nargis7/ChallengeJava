public class Method {
    public static void main(String[] args) {
        CheckEvenOdd(8);

    }
    public static void CheckEvenOdd(int number){
        if(number %2==0){
            System.out.println(number + " Even Number:");
        }else {
            System.out.println(number + " odd number:");
        }
    }
}
