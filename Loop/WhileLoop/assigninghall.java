import java.util.Scanner;

public class assigninghall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rollnumber;

        while (true) {
            System.out.print("Enter student's Roll Number [-1 for terminate]:-> ");
            rollnumber = scanner.nextInt();

            if (rollnumber == -1) {
                System.out.println("Terminating program, Exit...");
                break;
            }

            if (rollnumber <= 0) {
                System.out.println("Invalid roll number.Please enter a valid positive number");
                continue;
            }

            if (rollnumber >= 1 && rollnumber <= 50) {
                System.out.println("Roll Number " + rollnumber + " is assigned to Hall 1.");
            } else if (rollnumber >= 51 && rollnumber <= 100) {
                System.out.println("Roll Number " + rollnumber + " is assigned to Hall 2.");
            } else if (rollnumber >= 101 && rollnumber <= 150) {
                System.out.println("Roll Number " + rollnumber + " is assigned to Hall 3.");
            } else {
                System.out.println("Roll Number " + rollnumber + " is assigned to Hall 4.");
            }
        }
        scanner.close();
    }
}
