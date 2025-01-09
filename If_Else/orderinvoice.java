import java.util.Scanner;

public class orderinvoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your order number (such as ORD1234) :-> ");
        String orderNumber = scanner.nextLine();

        if (orderNumber.equals(" ")) {
            System.out.println("Error: Order number cannot be empty");
        } else if (orderNumber.length() == 7 && orderNumber.startsWith("ORD")) {
            char c1 = orderNumber.charAt(3);
            char c2 = orderNumber.charAt(4);
            char c3 = orderNumber.charAt(5);
            char c4 = orderNumber.charAt(6);

            if ((c1 >= '0' && c1 <= '9') && (c2 >= '0' && c2 <= '9') && (c3 >= '0' && c3 <= '9')
                    && (c4 >= '0' && c4 <= '9')) {
                System.out.println("Order Invoice");
                System.out.println("--------------------------------------");
                System.out.println("Order Number : " + orderNumber);
                System.out.println("Customer Name: Patrick Bateman");
                System.out.println("Order Date: 17-Dec-2024");
                System.out.println("Product Details:");
                System.out.println("- Product Name: Bat Suit");
                System.out.println("- Price: 99999999");
                System.out.println("Total Amount: 99999999");
                System.out.println("Payment Status: Paid");
                System.out.println("------------------------------");
            } else {
                System.out.println("Error: Invalid Order Number Format. Please Enter valid order number");
            }
        } else {
            System.out.println("Invalid Order Number");
        }
        scanner.close();
    }
}
