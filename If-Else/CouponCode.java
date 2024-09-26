import java.util.Scanner;

public class CouponCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of Coupon Code");
        System.out.println("Coupon Code `SAVE10` gives a 10% discount");
        System.out.println("Coupon Code `SAVE20` gives a 20% discount");
        System.out.println("Coupon Code `SAVE30` gives a 30% discount");
        System.out.print("Choose Coupon Code :-> ");
        String code = scanner.nextLine();

        System.out.print("Enter your fare amount :->");
        float fare = scanner.nextFloat();

        double discount = 0;
        if (fare < 0) {
            System.out.println("Error : Fare cannot be negative.");
        } else {
            if (code.equalsIgnoreCase("SAVE10")) {
                discount = 0.10;
            } else if (code.equalsIgnoreCase("SAVE20")) {
                discount = 0.20;
            } else if (code.equalsIgnoreCase("SAVE30")) {
                discount = 0.30;
            } else {
                System.out.println("Invalid Coupon Code.");
            }
            double final_fare = fare - (discount * fare);
            System.out.println("The final fare after applying the discount is: " + final_fare);
        }

        scanner.close();
    }
}
