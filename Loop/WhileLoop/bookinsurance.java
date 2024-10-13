import java.util.Scanner;

public class bookinsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String memberShipStatus;
        while (true) {
            System.out.print("Enter Your membership status [y/n] :-> ");
            memberShipStatus = scanner.nextLine();

            if (memberShipStatus.equalsIgnoreCase("Y") || memberShipStatus.equalsIgnoreCase("N")) {
                if (memberShipStatus.equalsIgnoreCase("N")) {
                    System.out.println("Student is not registered library member.");
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please Enter [y/n]");
                continue;
            }
        }

        String overdueStatus;
        int bookIssue = 0;
        while (true) {
            System.out.print("Enter overdue Status if student have any overdue books? [y/n] :-> ");
            overdueStatus = scanner.nextLine();

            if (overdueStatus.equalsIgnoreCase("Y")) {
                System.out.println("Student has overdue books and cannot issue new books");
                break;
            } else if (overdueStatus.equalsIgnoreCase("N")) {
                System.out.print("Enter the number of books the student wants to issue (1 or 2) :-> ");
                bookIssue = scanner.nextInt();

                if (bookIssue == 1) {
                    System.out.println("1 Book successfully issued to the student");
                    break;
                } else if (bookIssue == 2) {
                    System.out.println("2 Books successfully issued to the student");
                    break;
                } else {
                    System.out.println("Cannot issue more than 2 books. Please enter a valid number");
                    continue;
                }
            }
        }
        scanner.close();
    }
}
