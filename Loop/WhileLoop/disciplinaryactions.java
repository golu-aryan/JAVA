import java.util.Scanner;

public class disciplinaryactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int offenseCount = 0;
        String violation;

        System.out.print("Enter Student's Name :-> ");
        String name = scanner.nextLine();

        System.out.print("Enter Student's ID number :-> ");
        int IDnumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("---Violation Log---");
        System.out.println("Disobedience");
        System.out.println("Use of Mobile Phone in class");
        System.out.println("cheating during exams");

        while (offenseCount <= 5) {
            System.out.print("Enter the violation :-> ");
            violation = scanner.nextLine();

            if (violation.equalsIgnoreCase("exit")) {
                break;
            }

            if (violation.equalsIgnoreCase(" ")) {
                System.out.println("Violation entry cannot be empty");
                continue;
            }

            offenseCount++;
            System.out.println("Violation log :-> " + violation);
            System.out.println("Total Offenses for " + name + " ( " + IDnumber + " ) :-> " + offenseCount);

            if (offenseCount >= 3 && offenseCount <= 5) {
                System.out.println("Warning : student " + name + " is flagged as having committed too many offenses");
            }

            if (offenseCount > 5) {
                System.out.println("Disciplinary action is recommended for " + name);
                break;
            }
        }

        scanner.close();
    }
}
