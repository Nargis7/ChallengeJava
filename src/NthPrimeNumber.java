import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int nthPrime = nthNumber(n);
        System.out.println("The " + n + "th prime number is: "+ nthPrime);
        sc.close();
    }
//    function to check nth prime number
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }
        }
            return true;
        }
//        function to find the nth number
        public static int nthNumber(int n){
            int count =0;
            int num = 1;
            while(count<n){
                num++;
                if(isPrime(num)){
                    count++;
                }
            }
            return num;
        }
    }
