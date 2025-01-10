import java.util.Scanner;

public class bookingConfirmation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bus Type [Sleeper/Semi-Sleeper/AC/Non-AC] :-> ");
        String type = scanner.nextLine();

        System.out.print("Enter seat number :-> ");
        int seat = scanner.nextInt();

        if (seat < 1 || seat > 40) {
            System.out.println("Error : Invalid seat number. Please enter a number between 1 and 40.");
        } else if (type.equalsIgnoreCase("sleeper")) {
            System.out.println("Booking is Confirmed.Your Bus type is : " + type + " & seat number is " + seat);
        } else if (type.equalsIgnoreCase("Semi-sleeper")) {
            System.out.println("Booking is confirmed.Your Bus type is : " + type + " & seat number is " + seat);
        } else if (type.equalsIgnoreCase("AC")) {
            System.out.println("Booking is confirmed.Your Bus type is : " + type + " & seat number is " + seat);
        } else if (type.equalsIgnoreCase("Non-AC")) {
            System.out.println("Booking is confirmed.Your Bus type is : " + type + " & seat number is " + seat);
        } else {
            System.out.println("Invalid input! Please choose valid bus type and seat number must be in between 1 to 40.");
        }
        scanner.close();
    }
}
