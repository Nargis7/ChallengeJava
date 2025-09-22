public class NumberConverter {
    public static void main(String[] args) {
        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decToBin(n);
    }

    static void decToBin(int n) {
        int[] binaryNum = new int[1000];
        int i = 0;

        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // Print digits in same line
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
        System.out.println(); // move to next line after printing
    }
}
