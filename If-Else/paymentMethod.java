import java.util.Scanner;

public class paymentMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Payment Method [Credit card/Debit Card/ UPI] :-> ");
        String paymentMethod = scanner.nextLine();

        switch (paymentMethod) {
            case "Credit card":
                System.out.println("You selected Credit Card. Please enter your card details for processing");
                break;
            case "Debit Card":
                System.out.println("You selected Debit Card. Please enter your card details for processing");
                break;
            case "UPI":
                System.out.println("You selected UPI. Please enter your UPI ID for processing");
                break;
            default:
                System.out.println(
                        "Invalid payment method selected. Please choose a valid option: Credit Card, Debit Card or UPI.");
                break;
        }

        scanner.close();
    }
}
