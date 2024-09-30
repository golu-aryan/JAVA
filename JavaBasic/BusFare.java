import java.util.Scanner;

public class BusFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double GSTRate = 0.18;
        System.out.print("Enter Base Fare of the Bus Ticket :-> ");
        double base_fare = scanner.nextDouble();

        if (base_fare >= 1) {
            double GSTAmount = base_fare * GSTRate;
            double total_fare = base_fare + GSTAmount;
            System.out.println("GST Amount (18% of your Base Fare) is :-> " + GSTAmount);
            System.out.println("Total Fare Amount is :-> " + total_fare);
        } else {
            System.out.println("Invalid input, Try Again");
        }

        scanner.close();
    }
}
