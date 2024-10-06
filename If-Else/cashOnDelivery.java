import java.util.Scanner;

public class cashOnDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Delivery Location :-> ");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("Mumbai") || location.equalsIgnoreCase("Delhi") ||
                location.equalsIgnoreCase("Bangalore") || location.equalsIgnoreCase("Hyderabad") ||
                location.equalsIgnoreCase("Chennai") || location.equalsIgnoreCase("Kolkata") ||
                location.equalsIgnoreCase("Pune") || location.equalsIgnoreCase("Ahmedabad") ||
                location.equalsIgnoreCase("Jaipur") || location.equalsIgnoreCase("Surat")) {
            System.out.println("COD is available for " + location);
        } else {
            System.out.println("COD is not available for " + location);
        }

        scanner.close();
    }
}
