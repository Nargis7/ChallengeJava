public class CheckPrime {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;

            }
        }
        return true;
    }
}
