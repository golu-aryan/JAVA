import java.util.Scanner;

//write a program to accept the price and GST rate of three products.
//Calculate the total price of each product including tax.
public class threeproduct {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of product 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the GST rate for product 1 (in percentage): ");
        double gstRate1 = input.nextDouble();
        double totalPrice1 = price1 + (price1 * gstRate1 / 100);
        System.out.println("The total price of product 1 including GST is: " + totalPrice1);
        System.out.println("--------------------------------------");

        System.out.print("Enter the price of product 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the GST rate for product 2 (in percentage): ");
        double gstRate2 = input.nextDouble();
        double totalPrice2 = price2 + (price2 * gstRate2 / 100);
        System.out.println("The total price of product 2 including GST is: " + totalPrice2);
        System.out.println("--------------------------------------");

        System.out.print("Enter the price of product 3: ");
        double price3 = input.nextDouble();
        System.out.print("Enter the GST rate for product 3 (in percentage): ");
        double gstRate3 = input.nextDouble();
        double totalPrice3 = price3 + (price3 * gstRate3 / 100);
        System.out.println("The total price of product 3 including GST is: " + totalPrice3);
        System.out.println("--------------------------------------");

        input.close();
    }
}
