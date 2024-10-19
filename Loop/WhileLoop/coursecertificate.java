import java.util.Scanner;

public class coursecertificate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalClass, attendclass;
        double payment, totalfee;
        String userChoice;
        boolean isEligible = true;
        System.out.print(
                "Do you want to check whether student is eligible to recieve their course completion certificate? [y/n] :-> ");
        userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {

            System.out.print("Enter total number of classes :-> ");
            totalClass = scanner.nextInt();

            System.out.print("Enter number of classes attend by student :-> ");
            attendclass = scanner.nextInt();

            if (totalClass < 0 || attendclass < 0 || attendclass > totalClass) {
                System.out.println("Invalid Input for classes. Please enter valid input");
                continue;
            }

            double attendancepercentage = ((double) attendclass / totalClass) * 100;
            if (attendancepercentage < 75) {
                System.out.println("Student is not eligible due to low attendance");
                isEligible = false;
                break;
            }

            if (isEligible) {
                System.out.print("Enter total course fee :-> ");
                totalfee = scanner.nextInt();
                System.out.print("Enter fee amount paid by student :-> ");
                payment = scanner.nextInt();

                if (totalfee < 0 || payment < 0 || payment > totalfee) {
                    System.out.println("Invalid input for fee. Please enter valid input");
                    continue;
                }

                if (payment < totalfee) {
                    System.out.println("Student is not eligible due to remaining fee");
                    isEligible = false;
                    break;
                }
            }

            if (isEligible) {
                System.out.print("Enter total marks in the final exam :-> ");
                int totalmarks = scanner.nextInt();

                System.out.print("Enter marks obtained by the student :-> ");
                int obtainmarks = scanner.nextInt();

                if (totalmarks < 0 || obtainmarks < 0 || obtainmarks > totalmarks) {
                    System.out.println("Invalid input for marks. Please enter valid input");
                    continue;
                }

                double percentage = ((double) obtainmarks / totalmarks) * 100;
                if (percentage < 40) {
                    System.out.println("Student is not eligible due to low marks");
                    isEligible = false;
                    break;
                }
            }
            scanner.nextLine();
            System.out.print("Do you want to check again? [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Exit...");
                break;
            }
        }
        if (isEligible) {
            System.out.println("Student is eligible for the course completion certificate");
        }

        scanner.close();
    }
}
