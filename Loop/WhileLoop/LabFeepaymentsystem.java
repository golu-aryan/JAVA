import java.util.Scanner;

public class LabFeepaymentsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attendance = 0, fee = 100, totalLabFee = 0, remainingFee, installment = 0, payment = 0;
        String userChoice;

        System.out.print("Do you want to calculate lab fee? [y/n] :-> ");
        userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter how many practical classes attended by student :-> ");
            if (scanner.hasNextInt()) {
                attendance = scanner.nextInt();

                if (attendance <= 0) {
                    System.out.println("Invalid input! Number of classes must be greater than 0");
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number of classes");
                scanner.next();
                continue;
            }
        }

        totalLabFee = attendance * fee;
        remainingFee = totalLabFee;

        System.out.println("Your Total Lab Fee : " + totalLabFee);

        while (remainingFee > 0) {
            System.out.print("Enter Payment Amount :-> ");

            if (scanner.hasNextInt()) {
                payment = scanner.nextInt();

                if (payment <= 0) {
                    System.out.println("Invalid Payment Fee! Please Enter a Positive integer");

                    continue;
                } else if (payment > remainingFee) {
                    System.out.println(
                            "Payment Exceeds the remaining balance! Please enter less than or equal to : "
                                    + remainingFee);
                    continue;
                }

                remainingFee -= payment;
                installment++;
                System.out.println("Payment of " + payment + " accepted. Remaining Fee : " + remainingFee);
                scanner.nextLine();
            } else {
                System.out.println("Invalid input! Please enter payment amount");
                scanner.next();
                continue;

            }
            if (remainingFee == 0) {
                System.out
                        .println("Payment complete! You have paid " + totalLabFee + " in " + installment
                                + " installments");
                break;
            }

            System.out.print("If you want to pay remaining Fee [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                break;
            } else if (userChoice.equalsIgnoreCase("y")) {
                continue;
            } 
        }
        scanner.close();
    }
}
