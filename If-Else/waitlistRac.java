import java.util.Scanner;

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
