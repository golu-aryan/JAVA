import java.util.Scanner;

import javax.print.attribute.standard.Destination;

public class busFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 5, distance = 1;
        double Total_fare;
        System.out.println("City Name [Banglore, Chennai, Mumbai, Pune, Goa]");
        System.out.print("Enter Source City :-> ");
        String sourceCity = scanner.nextLine();

        System.out.print("Enter Destination City :-> ");
        String destinationCity = scanner.nextLine();

        int Banglore_to_Chennai = 500;
        int Banglore_to_Mumbai = 1000;
        int Banglore_to_Pune = 800;
        int Banglore_to_Goa = 300;
        int Chennai_to_Mumbai = 1350;
        int Chennai_to_Pune = 1500;
        int Chennai_to_Goa = 999;
        int Mumbai_to_Pune = 1245;
        int Mumbai_to_Goa = 1765;
        int Pune_to_Goa = 1250;

        if (sourceCity.equalsIgnoreCase("Banglore") && destinationCity.equalsIgnoreCase("Chennai")
                || sourceCity.equalsIgnoreCase("Chennai") && destinationCity.equalsIgnoreCase("Banglore")) {
            distance = Banglore_to_Chennai;
        } else if (sourceCity.equalsIgnoreCase("Banglore") && destinationCity.equalsIgnoreCase("Mumbai")
                || sourceCity.equalsIgnoreCase("Mumbai") && destinationCity.equalsIgnoreCase("Banglore")) {
            distance = Banglore_to_Mumbai;
        } else if (sourceCity.equalsIgnoreCase("Banglore") && destinationCity.equalsIgnoreCase("Pune")
                || sourceCity.equalsIgnoreCase("Pune") && destinationCity.equalsIgnoreCase("Banglore")) {
            distance = Banglore_to_Pune;
        } else if (sourceCity.equalsIgnoreCase("Banglore") && destinationCity.equalsIgnoreCase("Goa")
                || sourceCity.equalsIgnoreCase("Goa") && destinationCity.equalsIgnoreCase("Banglore")) {
            distance = Banglore_to_Goa;
        } else if (sourceCity.equalsIgnoreCase("Chennai") && destinationCity.equalsIgnoreCase("Mumbai")
                || sourceCity.equalsIgnoreCase("Mumbai") && destinationCity.equalsIgnoreCase("Chennai")) {
            distance = Chennai_to_Mumbai;
        } else if (sourceCity.equalsIgnoreCase("Chennai") && destinationCity.equalsIgnoreCase("Pune")
                || sourceCity.equalsIgnoreCase("Pune") && destinationCity.equalsIgnoreCase("Chennai")) {
            distance = Chennai_to_Pune;
        } else if (sourceCity.equalsIgnoreCase("Chennai") && destinationCity.equalsIgnoreCase("Goa")
                || sourceCity.equalsIgnoreCase("Goa") && destinationCity.equalsIgnoreCase("Chennai")) {
            distance = Chennai_to_Goa;
        } else if (sourceCity.equalsIgnoreCase("Mumbai") && destinationCity.equalsIgnoreCase("Pune")
                || sourceCity.equalsIgnoreCase("Pune") && destinationCity.equalsIgnoreCase("Mumbai")) {
            distance = Mumbai_to_Pune;
        } else if (sourceCity.equalsIgnoreCase("Mumbai") && destinationCity.equalsIgnoreCase("Goa")
                || sourceCity.equalsIgnoreCase("Goa") && destinationCity.equalsIgnoreCase("Mumbai")) {
            distance = Mumbai_to_Goa;
        } else if (sourceCity.equalsIgnoreCase("Pune") && destinationCity.equalsIgnoreCase("Goa")
                || sourceCity.equalsIgnoreCase("Goa") && destinationCity.equalsIgnoreCase("Pune")) {
            distance = Pune_to_Goa;
        } else {
            System.out.println("Invalid Input");
        }

        if (distance > 0) {
            Total_fare = distance * rate;
            System.out.println("The Distance Between " + sourceCity + " and " + destinationCity + " is : " + distance);
            System.out.println("The Total Fare Amount for your journey is : " + Total_fare);
        } else {
            System.out.println("Invalid Source and Destination city, Please try Again");
        }

        scanner.close();
    }
}