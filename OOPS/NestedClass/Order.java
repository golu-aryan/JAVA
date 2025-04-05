package JAVA.OOPS.NestedClass;

import java.util.Scanner;

public class Order {
    private int orderID;
    private double amount;

    public Order (int orderId, double amount) {
        this.orderID = orderId;
        this.amount = amount;
    }
    class Payment {
        void processPayment(String method) {
            System.out.println("Payment method used :-> " + method);
            System.out.println("OrderID :-> " + orderID);
            System.out.println("Final Payable amount :-> " + amount);
        }
    }

    static class DiscountCalculator {
        static double applyDiscount (double amount, double discountPercent) {
            return amount - (amount * discountPercent/100);
        }
    }

    void placeOrder(String paymentMode, double discount) {
        double discountedAmount = DiscountCalculator.applyDiscount(amount, discount);
        System.out.println("Final Price After Discount :-> " + discountedAmount);
        amount = discountedAmount;

        Payment payment = new Payment();
        payment.processPayment(paymentMode);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OrderID :-> ");
        int orderID = scanner.nextInt();

        System.out.print("Enter Amount :-> ");
        double amount = scanner.nextDouble();

        System.out.println("Enter Discount :-> ");
        double discount = scanner.nextDouble();

        Order order = new Order(orderID, amount);
        System.out.println("---Order 1---");
        order.placeOrder("Credit Card", discount);

        System.out.println("---Order 2---");
        order.placeOrder("Debit Card", discount);

        scanner.close();
    }
}
