import java.util.Scanner;

//Class Upgrade Eligibility
//Write a Java program that checks if a passenger is eligible for a class upgrade. If the ticket is 
//booked in Sleeper Class and there are vacant seats in Second AC, print that the passenger can 
//be upgraded. Otherwise, print that an upgrade is not possible.
public class upgradeEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter class of booked Ticket : [ Sleeper/First AC/ Second AC ] :-> ");
        String bookedClass = scanner.nextLine();

        System.out.print("Enter number of vacant seats in Second AC :");
        int vacantSeats = scanner.nextInt();

        if (bookedClass.equalsIgnoreCase("Sleeper") && vacantSeats > 0) {
            System.out.println("Passenger can be Upgraded");
        } else {
            System.out.println("An Upgrade is not Possible ");
        }
        scanner.close();
    }
}
