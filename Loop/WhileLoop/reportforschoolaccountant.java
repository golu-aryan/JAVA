import java.util.Scanner;

public class reportforschoolaccountant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int itemCount = 0;
        System.out.print("Do you want to generate report for school accountant [y/n] :-> ");
        String userChoice = scanner.nextLine();
        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter price of each item sold :-> ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid input which is an integer value");
                continue;
            }
            double price = scanner.nextDouble();

            if (price <= 0) {
                System.out.println("Price must be positive integer or greater than 0");
                continue;
            }
            totalPrice += price;
            itemCount++;

            scanner.nextLine();
            System.out.print("Are there more item to enter? [y/n] :-> ");
            String moreItem = scanner.nextLine();

            if (moreItem.contentEquals("n")) {
                break;
            } else {
                continue;
            }
        }

        System.out.println("---Daily Sales Report---");
        System.out.println("Total Sales Amount :-> " + totalPrice);
        System.out.println("Total number of item sold :-> " + itemCount);
        System.out.println("Thank you! The report has been successfully generated for the school accountant.");
        scanner.close();
    }
}
