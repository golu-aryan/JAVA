import java.util.Scanner;

public class Overdue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName, userchoice;
        int studentRollnumber;
        int days;
        System.out.print("Do you want to calculate fine for book [yes/no] :-> ");
        userchoice = scanner.nextLine();
        while (userchoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Student's Name [or type 'Exit' for Quit] :-> ");
            studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("Exit")) {
                System.out.println("ThankU! Exit Processing");
                break;
            } else if (studentName.equals(" ") || studentName.matches("\\d+")) {
                System.out.println("Invalid Name, Please Enter Valid Name");
                continue;
            }

            System.out.print("Enter Student's RollNumber :-> ");
            if (scanner.hasNextInt()) {
                studentRollnumber = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Sry! Invalid Input, Please Try Again.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Enter the number of days a book is overdue :-> ");
            if (!scanner.hasNextInt()) {
                System.out.println("Sry! Invalid Input for Roll Number. Please Try Again");
                scanner.nextLine();
                continue;
            }
            days = scanner.nextInt();
            scanner.nextLine();

            double fine = 0;

            if (days < 0) {
                System.out.println("Invalid Input. Overdue Days cannot be negative");
                continue;
            } else if (days == 0) {
                System.out.println("No fine applicable, the book is returned on time.");
            } else if (days <= 5) {
                fine = days * 2;
            } else if (days >= 6 && days <= 10) {
                fine = (5 * 2) + ((days - 5) * 5);
            } else {
                fine = (5 * 2) + (5 * 5) + ((days - 10) * 10);
            }
            if (fine > 0) {
                System.out.println(
                        "The Total Fine for " + studentName + " (Roll No : " + studentRollnumber + ") is : " + fine);
            }
            System.out.print("Do you want to calculate fine for another book? [yes/no] :-> ");
            userchoice = scanner.nextLine();
            if (userchoice.equalsIgnoreCase("no"))
                break;
        }
        scanner.close();
    }
}