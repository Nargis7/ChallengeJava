import java.util.Scanner;

public class Quiz {
    // This is a simple quiz application for a competition at Arka Jain University.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Competition at Arka Jain University!");

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");

        System.out.print("Enter your Enrollment Number: ");
        int enrollment = sc.nextInt();
        sc.nextLine(); // Clear the buffer

        System.out.print("Do you want to start the quiz? (Y/N): ");
        char start = sc.nextLine().charAt(0);

        int count = 0;

        if (start == 'Y' || start == 'y') {
            System.out.println("Starting the quiz...");

            // Question 1
            System.out.println("\nQuestion 1 - What is the capital of India?");
            System.out.println("1. Kolkata\n2. New Delhi\n3. Mumbai\n4. Jamshedpur");
            System.out.print("Enter your answer: ");
            int ans1 = sc.nextInt();
            if (ans1 == 2) {
                System.out.println("Correct Answer!");
                count++;
            } else {
                System.out.println("Incorrect Answer.");
            }

            // Question 2
            System.out.println("\nQuestion 2 - Who is the founder of Java?");
            System.out.println("1. Sanjeev\n2. James Gosling\n3. Nargis Gunda\n4. Sumit");
            System.out.print("Enter your answer: ");
            int ans2 = sc.nextInt();
            if (ans2 == 2) {
                System.out.println("Correct Answer!");
                count++;
            } else {
                System.out.println("Incorrect Answer.");
            }

            // Question 3
            System.out.println("\nQuestion 3 - Who is the Prime Minister of India?");
            System.out.println("1. Rahul Gandhi\n2. Arvind Kejriwal\n3. Mamta Banerjee\n4. Narendra Modi");
            System.out.print("Enter your answer: ");
            int ans3 = sc.nextInt();
            if (ans3 == 4) {
                System.out.println("Correct Answer!");
                count++;
            } else {
                System.out.println("Incorrect Answer.");
            }

            // Question 4
            System.out.println("\nQuestion 4 - Who is the founder of Android?");
            System.out.println("1. Andy Rubin\n2. Sundar Pichai\n3. Larry Page\n4. Sergey Brin");
            System.out.print("Enter your answer: ");
            int ans4 = sc.nextInt();
            if (ans4 == 1) {
                System.out.println("Correct Answer!");
                count++;
            } else {
                System.out.println("Incorrect Answer.");
            }

            // Question 5
            System.out.println("\nQuestion 5 - Who is the creator of Python?");
            System.out.println("1. Dennis Ritchie\n2. James Gosling\n3. Guido van Rossum\n4. Brendan Eich");
            System.out.print("Enter your answer: ");
            int ans5 = sc.nextInt();
            if (ans5 == 3) {
                System.out.println("Correct Answer!");
                count++;
            } else {
                System.out.println("Incorrect Answer.");
            }

            // Final Score
            System.out.println("\nYour total score is: " + count + " out of 5");
        } else {
            System.out.println("Quiz not started. Exiting...");
        }

        sc.close();
    }
}
