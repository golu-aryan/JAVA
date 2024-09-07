//Write a program to compute the final amount after adding a sales tax to subtotal of purchased items.
//Consider that the customer has purchased 5 items.

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        double price1 = scanner.nextDouble();
        System.out.println("Enter the price of item 2:");
        double price2 = scanner.nextDouble();
        System.out.println("Enter the price of item 3:");
        double price3 = scanner.nextDouble();
        System.out.println("Enter the price of item 4:");
        double price4 = scanner.nextDouble();
        System.out.println("Enter the price of item 5:");
        double price5 = scanner.nextDouble();

        double subtotal = price1 + price2 + price3 + price4 + price5;

        System.out.println("Enter the sales tax percentage:");
        double salesTaxPercentage = scanner.nextDouble();

        double salesTaxAmount = (subtotal * salesTaxPercentage) / 100;

        double finalAmount = subtotal + salesTaxAmount;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales Tax: $" + salesTaxAmount);
        System.out.println("Final Amount (including sales tax): $" + finalAmount);

    }
}
