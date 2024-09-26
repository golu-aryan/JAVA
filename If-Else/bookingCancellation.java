import java.util.Scanner;

public class bookingCancellation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketPrice = 1500;

        System.out.print("Enter number of hours :-> ");
        int cancellationTime = scanner.nextInt();

        double cancellationFee = 0;

        if (cancellationTime > 24) {
            cancellationFee = ticketPrice * 0.10;
            System.out.println("Cancellation fee is : " + cancellationFee);
        } else if (cancellationTime >= 12 && cancellationTime <= 24) {
            cancellationFee = 0.20 * ticketPrice;
            System.out.println("Cancellation Fee is : " + cancellationFee);
        } else if (cancellationTime >= 4 && cancellationTime < 12) {
            cancellationFee = 0.50 * ticketPrice;
            System.out.println("Cancellation Fee is : " + cancellationFee);
        } else if (cancellationTime > 0 && cancellationTime < 4) {
            cancellationFee = 0.75 * ticketPrice;
            System.out.println("Cancellation Fee is : " + cancellationFee);
        } else {
            System.out.println("Cancellation is not allowed. Full ticket amount is non-refundable.");
        }
        scanner.close();
    }
}
