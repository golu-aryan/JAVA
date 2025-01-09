import java.util.Scanner;

public class paymentOffers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your preffered payment Method [Credit Card, Debit Card, UPI, Net Banking] :-> ");
        String paymentMethod = scanner.nextLine();

        if (paymentMethod.equalsIgnoreCase("Credit Card")) {
            System.out.println("Offer: 10% cashback on purchases above 2000.");
        } else if (paymentMethod.equalsIgnoreCase("Debit Card")) {
            System.out.println("Offer: 5% instant discount on all purchases.");
        } else if (paymentMethod.equalsIgnoreCase("UPI")) {
            System.out.println("Offer: Flat 50 off on orders above 1000.");
        } else if (paymentMethod.equalsIgnoreCase("Net Banking")) {
            System.out.println("Offer: 5% cashback on first transaction.");
        } else {
            System.out.println(
                    "Invalid payment method. Please choose either Credit Card, Debit Card, UPI, or Net Banking.");
        }
        scanner.close();
    }
}
