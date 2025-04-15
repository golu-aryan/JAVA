package JAVA.Basic;
import java.util.Scanner;
public class studentMarks {
    public static void main(String[] args) {
        String name;
        int rollNumber;
        float cMarks, javaMarks, totalMarks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter your marks in C language: ");
        cMarks = scanner.nextFloat();

        System.out.print("Enter your marks in Java language: ");
        javaMarks = scanner.nextFloat();

        totalMarks = cMarks + javaMarks;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);

        scanner.close();
    }
}
