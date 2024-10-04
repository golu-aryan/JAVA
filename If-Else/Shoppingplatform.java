import java.util.Scanner;

public class Shoppingplatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Type [Business / Personal] :-> ");
        String accType = scanner.nextLine();

        switch (accType.toLowerCase()) {
            case "business":
                System.out.println("--- Business Account Benefits ---");
                System.out.println("1> Access to bulk purchasing discounts.");
                System.out.println("2> Dedicated customer support for business queries.");
                System.out.println("3> Business purchase invoices for accounting purposes.");
                System.out.println("4> Eligibility for business credit options.");
                break;

            case "personal":
                System.out.println(">>> Personal Account Benefits <<<");
                System.out.println("1>  Exclusive discounts and offers for personal shopping.");
                System.out.println("2>  Access to customer loyality program and rewards.");
                System.out.println("Personalized product recommendations based on shopping history.");
                System.out.println("Free returns on eligible items.");
                break;
            default:
                System.out.println(
                        "The input is not recognized & enter a valid account type again.");
                break;
        }
        scanner.close();
    }
}
