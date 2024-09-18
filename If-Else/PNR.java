// PNR Status Checking
// Write a Java program that simulates checking the PNR status of a booked ticket. Based on the 
// input status (Booked, RAC, Waitlist, or Confirmed), print the appropriate message:
// "Your ticket is confirmed."
// "Your ticket is RAC."
// "Your ticket is on the waitlist."
// "Your booking is not yet done."

import java.util.Scanner;

public class PNR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your status [ Booked, RAC, WaitList, Confirmed ] :-> ");
        String status = scanner.nextLine();

        if(status.equalsIgnoreCase("Booked")) {
            System.out.println("your Ticket is confirmed");
        } else if (status.equalsIgnoreCase("RAC")) {
            System.out.println("Your Ticket is RAC");
        } else if (status.equalsIgnoreCase("WaitList")) {
            System.out.println("your Ticket is on the WaitList");
        } else if (status.equalsIgnoreCase("Confirmed")) {
            System.out.println("Your Booking is Confirmed");
        }

        scanner.close();
    }
}
