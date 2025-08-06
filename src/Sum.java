import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int num1 = 20;
//        int num2 = 30;
//        int sum = num1 + num2;
//        System.out.println("sum of two numbers is : " + sum);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.print("Enter first number:");
        int num1 = in.nextInt();
        System.out.print("Enter Second number:");
        int num2 = in.nextInt();
        int sum =  num1+num2;
        System.out.println("Enter sum of two number is :" + sum);
    }
}
