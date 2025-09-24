public class ModuloExample {
    public static void main(String[] args) {
        int a = 25;
        int b = 7;

//        remainder
        int results = a % b;
        System.out.println("25 % 7 = " + results);
//        some properties
        System.out.println("(7+11) % 5 = " + (7+11) % 5);
        System.out.println("(7 % 5) + (11 % 5) % 5 =  " + (7 % 5 + 11 % 5) % 5);


        // Negative numbers
        System.out.println("(-7 % 5) = " + (-7 % 5));  // In Java → -2


//        to avoid negative numbers we always add +m
        System.out.println("((-7 % 5) + 5) % 5 = " + ((-7 % 5) + 5) % 5);  // → 3

    }
}
