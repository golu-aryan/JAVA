import java.util.Scanner;

public class studentregistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentAge;
        String studentName, studentGrade;

        while (true) {
            System.out.print("Enter Student's Name [OtherWise type 'Exit' to Quit] :-> ");
            studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting the registration Process");
                break;
            } else if (studentName.isEmpty() || studentName.matches("\\d+")) {
                System.out.println("Error: Invalid Name. Please enter valid name");
                continue;
            }

            System.out.print("Enter Student's Age :-> ");
            if (scanner.hasNextInt()) {
                studentAge = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid age input. Please Enter numeric value");
                continue;
            }

            if (studentAge < 5) {
                System.out.println("Student is too Young.");
                continue;
            } else if (studentAge > 18) {
                System.out.println("Student is too Old.");
                continue;
            }

            while (true) {
                System.out.print("Enter Student's Grade :-> ");
                studentGrade = scanner.nextLine();

                if (studentGrade.equalsIgnoreCase("1st") || studentGrade.equalsIgnoreCase("2nd")
                        || studentGrade.equalsIgnoreCase("3rd")) {
                    break;
                } else {
                    System.out.println("Invalid grade format. Please Enter a valid grade");
                }
            }
            System.out.println("Student " + studentName + " (Age : " + studentAge + " , Grade : " + studentGrade
                    + ") has been successfully registered.");
            break;
        }

        scanner.close();
    }
}
