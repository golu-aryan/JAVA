import java.util.Scanner;

// Grade Evaluation
// Write a Java program that takes a student's marks (out of 
// 100) as input and prints the grade based on the following criteria:
// Marks >= 90: Grade A
// Marks >= 80: Grade B
// Marks >= 70: Grade C
// Marks >= 60: Grade D
// Marks < 60: Grade F
public class gradeEvaluation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student's Marks : ");
        int marks = scanner.nextInt();

        if(marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        scanner.close();
    }
}
