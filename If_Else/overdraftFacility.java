import java.util.Scanner;

public class overdraftFacility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account type [Saving, current] :-> ");
        String account = scanner.nextLine();

        System.out.print("Enter your current account balance :-> ");
        double balance = scanner.nextDouble();

        if (account.equalsIgnoreCase("Saving")) {
            if (balance >= 5000) {
                System.out.println("You're eligible for an overdraft of up to 2,000");
            } else {
                System.out.println("You're not eligible for an overfdraft, Minimum balance required is 5,000 ");
            }
        } else if (account.equalsIgnoreCase("current")) {
            if (balance >= 10000) {
                System.out.println("You're eligible for an overdraft of up to 5,000");
            } else {
                System.out.println("You're not eligible for an overdraft, Minimum balance required is 10,000");
            }
        } else {
            System.out.println("Invalid Account Type");
        }

        scanner.close();
    }
}
