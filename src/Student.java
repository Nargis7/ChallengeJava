// create a Student class
public class Student {
    // Declaring attributes
    String name;
    int rollNo;
    String section;

    // initialize attributes
    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // print details
    public void printDetails() {
        System.out.print("Student Details: ");
        System.out.println(this.name  + ", " + this.rollNo + ", " + section);
    }


    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Nargis", 101, "A");
        Student s2 = new Student("Ankit", 102, "B");

        // Print details
        s1.printDetails();
        s2.printDetails();

    }
}