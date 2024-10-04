import java.util.Scanner;

public class LocationCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your location [Local, National, InterNational] :-> ");
        String location = scanner.nextLine().toLowerCase();

        double deliveryCharge = 0;
        switch (location) {
            case "local":
                deliveryCharge = 50.0;
                System.out.println("For Local Deliveries, the charge is " + deliveryCharge);
                break;

            case "national":
                deliveryCharge = 100.0;
                System.out.println("For Naitonal Deliveries, the charge is " + deliveryCharge);
                break;

            case "international":
                deliveryCharge = 250.0;
                System.out.println("For InterNational Deliveries, the charge is " + deliveryCharge);
                break;

            default:
                System.out.println("Invalid Location. Please Enter [Local, Naitonal, InterNational]");
                break;
        }
        scanner.close();
    }
}
