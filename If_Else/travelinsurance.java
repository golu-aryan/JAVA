import java.util.Scanner;

public class travelinsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Ticket type [Economy, Business, First Class] :-> ");
        String ticket_type = scanner.nextLine();

        if (ticket_type.equalsIgnoreCase("Economy")) {
            System.out.println("Economy ticket holders are not offered travel insurance.");
        } else if (ticket_type.equalsIgnoreCase("Business") || ticket_type.equalsIgnoreCase("First Class")) {
            System.out.println("Business and First Class ticket holders are offered optional travel insurance");
        } else {
            System.out.println("Error : Invalid ticket type. Please enter a valid Ticket type.");
        }
        scanner.close();
    }
}
