import java.util.Scanner;

public class inputmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;

        System.out.print("Do you want to input student's marks [y/n] :-> ");
        String userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter marks for each student [0-100] & -1 for stop :-> ");
            if (!scanner.hasNextInt()) {
                System.out.println("You entered invalid input, Please Try Again with valid input");
                scanner.next();
                continue;
            }
            marks = scanner.nextInt();

            if (marks == -1) {
                System.out.println("Marks entry finished");
                break;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Sry! You entered Wrong input, Please Enter a valid input");
                continue;
            }

            if (marks >= 30) {
                System.out.println("Student Passed");
            } else {
                System.out.println("Student failed");
            }
            scanner.nextLine();

            System.out.print("Do you want to input student's marks again? [y/n] :-> ");
            userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Exit...");
                break;
            }
        }
        scanner.close();
    }
}