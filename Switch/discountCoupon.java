import java.util.Scanner;

public class discountCoupon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original price of the item [in dollars] :-> ");
        double originalPrice = scanner.nextDouble();
        scanner.nextLine();

        if (originalPrice <= 0) {
            System.out.println("Error: The original price must be a positive");
        } else {
            System.out.print("Enter Coupon Code :-> ");
            String couponCode = scanner.nextLine();

            double finalPrice = originalPrice;

            switch (couponCode.toUpperCase()) {
                case "DISCOUNT10":
                    finalPrice = originalPrice * 0.90;
                    System.out.println("New Price = " + finalPrice);
                    break;
                case "DISCOUNT20":
                    finalPrice = originalPrice * 0.80;
                    System.out.println("New Price = " + finalPrice);
                    break;
                case "DISCOUNT30":
                    finalPrice = originalPrice * 0.70;
                    System.out.println("New Price = " + finalPrice);
                    break;

                default:
                    System.out.println("Sry! Invalid or Expired Coupon Code. No Discount applied");
                    break;
            }
        }
        scanner.close();
    }
}
