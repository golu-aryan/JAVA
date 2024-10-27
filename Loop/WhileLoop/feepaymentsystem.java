import java.util.Scanner;

public class feepaymentsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalfee, maxinstallment, currentinstallment = 0;
        String userChoice;
        double amountpaid = 0, payment;

        System.out.print("Do you want to pay fees? [y/n] :-> ");
        userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {

            System.out.print("Enter total fee Amount [10,000 to 2,00,000]:-> ");
            totalfee = scanner.nextInt();

            if (totalfee < 10000 || totalfee > 200000) {
                System.out.println("Invalid amount. Please enter a fee amount between 10,000 and 2,00,000");
                continue;
            }

            System.out.print("Enter Maximum number of installments they want to pay :-> ");
            maxinstallment = scanner.nextInt();

            if (maxinstallment < 1 || maxinstallment > 12) {
                System.out.println("Invalid number of installments, Please enter a value between 1 and 12");
                continue;
            }

            while (currentinstallment < maxinstallment && amountpaid < totalfee) {
                currentinstallment++;
                System.out.print("Installment " + currentinstallment + ": Enter payment amount [minimum 1,000] :-> ");
                payment = scanner.nextInt();

                if (payment < 1000) {
                    System.out.println("Sry! Payment must be atleast 1,000. Please Try Again");
                    currentinstallment--;
                    continue;
                }

                if (payment > (totalfee - amountpaid)) {
                    System.out.println("Payment exceeds remaining balance. Please enter a valid amount");
                    currentinstallment--;
                    continue;
                }

                amountpaid += payment;
                double remaining = totalfee - amountpaid;

                System.out.println(payment + " accepted");
                System.out.println("Remaining fee amount : " + remaining);

                if (amountpaid == totalfee) {
                    System.out.println("Congratulations! You have fully paid your fee");
                    break;
                }
            }

            if (amountpaid < totalfee) {
                System.out.println("You have reached the maximum number of installments");
                System.out.println("Remaining amount to be paid : " + (totalfee - amountpaid));
                continue;
            }

            scanner.nextLine();
            System.out.print("Do you want to Pay fee Again? [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Exit...");
                break;
            }
        }

        scanner.close();
    }
}
