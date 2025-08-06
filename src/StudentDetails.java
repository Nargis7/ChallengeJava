import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        input student detail
        System.out.print("Enter students name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

//        input marks of 5 subjects

        int[] marks = new int[5];
        int total = 0;
        System.out.print("Enter marks for 5 subjects: ");
        for (int i=0;i< 5 ; i++){
            System.out.print("subjects " + (i+1) + ": ");
            marks[i] =sc.nextInt();
            total +=marks[i];
        }

//        calculate average
        double average = total / 5.0;

        System.out.println("\n---Students Details---");
        System.out.println("Name: " + name);

        System.out.println("Roll: " + roll);


        System.out.println("\nMarks in 5 subjects: ");

        for(int i=0; i<5; i++){
            System.out.println("subjects " + (i+1) + ": " + marks[i]);
        }

        System.out.println("\nTotal marks:  " + total);
        System.out.println("Average marks:   " + average);

        sc.close();
    }
}
