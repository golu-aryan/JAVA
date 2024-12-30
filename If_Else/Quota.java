import java.util.Scanner;

// Quota Booking Check
// Write a Java program that checks the type of quota used for booking (e.g., General, Tatkal, 
// Premium Tatkal, Ladies, Senior Citizen). Based on the quota selected, print the availability or 
// restriction message:
// General: "Open for all."
// Tatkal: "Open for booking after 10 AM."
// Ladies: "Only available for women passengers."
// Senior Citizen: "Applicable for senior citizens."
public class Quota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type of Quota used for Booking : [ General, Tatkal, Premium Tatkal, Ladies, Senior Citizen ] :->");
        String quotaType = scanner.nextLine();

        if (quotaType.equalsIgnoreCase("General")) {
            System.out.println("Open for all.");
        } else if (quotaType.equalsIgnoreCase("Tatkal")) {
            System.out.println("Open for booking after 10 AM.");
        } else if (quotaType.equalsIgnoreCase("Premium Tatkal")) {
            System.out.println("Only for Premium Tatkal Passengers");
        } else if (quotaType.equalsIgnoreCase("Ladies")) {
            System.out.println("Only available for women passengers.");
        } else if (quotaType.equalsIgnoreCase("Senior Citizen")) {
            System.out.println("Applicable for senior citizens.");
        } else {
            System.out.println("Sry! Invalid Quota Type.");
        }

        scanner.close();
    }
}
