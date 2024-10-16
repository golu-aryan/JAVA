import java.util.Scanner;

public class remainingAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double remainingAmount;

        System.out.print("Enter total Amount :-> ");
        double totalfee = scanner.nextDouble();

        remainingAmount = totalfee;

        while (remainingAmount > 0) {
            System.out.println("Remaining Amount : " + remainingAmount);
            System.out.print("Enter the amount you want to pay :-> ");
            double payment = scanner.nextDouble();

            if (payment <= 0) {
                System.out.println("Invalid Payment! Please Enter a Positive Numeric value");
                continue;
            } else if (payment > remainingAmount) {
                System.out.println("Sry! Payment exceeds the remaining balance. Please enter correct Payment");
                continue;
            }

            remainingAmount -= payment;
            System.out.println("Payment of " + payment + " accepted. Remaining balance : " + remainingAmount);
        }
        System.out.println("All dues are clear. No Balance remaining.");
        scanner.close();
    }
}
 