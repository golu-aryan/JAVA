import java.util.Scanner;

public class deliveryspeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your membership type [prime / Non-prime] :-> ");
        String membership = scanner.nextLine();

        if (membership.equalsIgnoreCase("prime")) {
            System.out.println("Estimated Delivery Time : Typically receive their order within 1 to 2 Business Days.");
        } else if (membership.equalsIgnoreCase("Non-Prime")) {
            System.out.println("Estimated Delivery Time : Typically recieve their order within 5 to 7 Business Days.");
        } else {
            System.out.println("Error : Input is invalid. Please enter a valid membership type.");
        }

        scanner.close();
    }
}
