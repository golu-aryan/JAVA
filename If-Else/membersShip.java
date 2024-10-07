import java.util.Scanner;

// You are tasked with writing a Java program for an online shopping platform that offers different types of memberships, each with its own set 
// of benefits. The program should:
// 1.Take the user's membership type as input, which can be either "Prime" or "Non-Prime."
// 2.Based on the membership type, display the relevant benefits to the user.
// 1. Prime Members enjoy:
// 1. Free one-day or two-day delivery.
// 2. Access to exclusive deals and discounts.
// 3. Prime Video and Music streaming services.
// 2. Non-Prime Members do not have these benefits but can still purchase products on the platform with standard delivery charges.
// 3.Validate the input to ensure it is either "Prime" or "Non-Prime."
// 1. If the input is not valid, the program should display an error message stating the input is invalid.
// Example:
// Scenario 1: Prime Member •Input: "Prime" •Output:
// "As a Prime member, you enjoy the following benefits: • Free one-day or two-day delivery. • Access to exclusive deals and discounts. • Prime Video and Music streaming services."
// Scenario 2: Non-Prime Member •Input: "Non-Prime" •Output:
// "As a Non-Prime member, you can still shop with standard delivery charges. Upgrade to Prime to enjoy additional benefits."
// Scenario 3: Invalid Input •Input: "VIP" •Output:
// "Invalid membership type. Please enter 'Prime' or 'Non-Prime'."
// Data Validation: •The program must validate the input to ensure it is either "Prime" or "Non-Prime." •If the input is neither "Prime" nor "Non-Prime", the program should display an error message indicating that the input is invalid.
public class membersShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your MemebrShip Type [Prime/Non-Prime] :-> ");
        String memberType = scanner.nextLine();

        if (memberType.equalsIgnoreCase("Prime")) {
            System.out.println("As a Prime member, you enjoy the following benefits:");
            System.out.println("> Free one-day or two-day delivery.");
            System.out.println("> Access to exclusive deals and discounts");
            System.out.println("> Prime Video and Music Streaming Services.");
        } else if (memberType.equalsIgnoreCase("Non-Prime")) {
            System.out.println("As a Non-Prime member, You can still shop with standard delivery charges.");
            System.out.println("Upgrade to prime to enjoy additional benefits.");
        } else {
            System.out.println("Invalid membership type. Please enter [Prime/Non-Prime]");
        }

        scanner.close();
    }
}
