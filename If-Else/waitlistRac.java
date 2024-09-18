import java.util.Scanner;

//Waitlist and RAC Confirmation
//Write a Java program that takes the waitlist number as input and checks if the ticket can be confirmed:
//If the waitlist number is less than or equal to 10, print "RAC Confirmed."
//If the waitlist number is greater than 10 but less than or equal to 50, print "Waitlist, high chance of 
//confirmation."Otherwise, print "Waitlist, low chance of confirmation."
public class waitlistRac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Waitlist Number :");
        int waitlistNumber = scanner.nextInt();

        if (waitlistNumber <= 10) {
            System.out.println("RAC Confirmed.");
        } else if (waitlistNumber > 10 && waitlistNumber <= 50) {
            System.out.println("WaitList, High chance of Confirmation.");
        } else {
            System.out.println("Otherwise, Low cahnce of Confirmation");
        }

        scanner.close();
    }
}
