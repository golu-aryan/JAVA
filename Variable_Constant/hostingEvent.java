//Write a program to compute cost of hosting an event in a hotel Ballroom.
//Calculate the total cost for hosting an event based on the number of attendees and the per-person charge.

import java.util.Scanner;

public class hostingEvent {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter number of attendees : ");
        int attendees = n.nextInt();

        System.out.print("Enter charge per-person :");
        int charge = n.nextInt();

        double totalCost = attendees * charge;

        System.out.println("The total cost of hosting an event is : " + totalCost);
        n.close();
    }
}
