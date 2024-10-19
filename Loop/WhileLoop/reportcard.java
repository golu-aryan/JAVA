import java.util.Scanner;

public class reportcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalmarks = 0, marks;
        double percentage;
        int subjectsCount = 1;
        String grade;

        System.out.print("Enter student's name :-> ");
        String name = scanner.nextLine();

        System.out.print("Enter stuent's class :-> ");
        int studentClass = scanner.nextInt();

        while (subjectsCount <= 5) {
            System.out.print("Enter student's marks for subjects " + subjectsCount + " :-> ");
            marks = scanner.nextInt();

            if (marks >= 0 && marks <= 100) {
                totalmarks += marks;
                subjectsCount++;
            } else {
                System.out.println("Invalid input! Please Enter marks between 0 and 100");
            }
        }
        percentage = (totalmarks / 5.0);

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 35) {
            grade = "D";
        } else {
            grade = "FAIL";
        }

        System.out.println("<<<REPORT CARD>>>");
        System.out.println("Student Name :-> " + name);
        System.out.println("Class :-> " + studentClass);
        System.out.println("Total Marks :-> " + totalmarks);
        System.out.println("Percentage :-> " + percentage);
        System.out.println("Grade :-> " + grade);

        scanner.close();
    }
}