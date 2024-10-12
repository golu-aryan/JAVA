import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = 0;
        int invalidAttempts = 0;

        System.out.print("Do you want to calculate student's grade on the basis of marks? [y/n] :-> ");
        String userinput = scanner.nextLine();

        while (userinput.equalsIgnoreCase("y")) {
            System.out.print("Enter the student's marks (0 to 100): ");
            marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                invalidAttempts++;
                System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");

                if (invalidAttempts >= 3) {
                    System.out.println("Too many invalid attempts.");
                    break;
                }

                continue;
            }

            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 75) {
                grade = 'B';
            } else if (marks >= 60) {
                grade = 'C';
            } else if (marks >= 45) {
                grade = 'D';
            } else if (marks >= 33) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            System.out.println("The student's grade is: " + grade);
            scanner.nextLine();
            System.out.print("Do you want to calculate again? [y/n] :-> ");
            userinput = scanner.nextLine();

            if (userinput.equalsIgnoreCase("n")) {
                break;
            }

        }

        scanner.close();
    }
}