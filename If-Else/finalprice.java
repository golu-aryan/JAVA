import java.util.Scanner;
// Write a simple price calculation feature for an e-commerce system. This feature calculates the final price of 
// a product after applying a discount based on user input.
// Write a Java program that:
// 1.Takes two inputs from the user:
// 1. The original price of the product (in dollars).
// 2. The discount percentage offered on the product.
// 2.Calculates the final price after applying the discount:
// 3.Validation Requirements:
// 1. Ensure that both the original price and the discount percentage are non-negative values.
// 2. If either the original price or the discount percentage is negative, the program should print an 
// appropriate error message and terminate the calculation without proceeding further.
// 4.Output:
// 1. If the inputs are valid, display the final price after applying the discount.
// 2. If any input is invalid (i.e., negative values), display an appropriate error message explaining what 
// went wrong.
// Inputs:
// 1.Original Price: A positive floating-point number (e.g., Rs. 49.99).
// 2.Discount Percentage: A positive floating-point number (e.g., 15%).
// Outputs:
// 1.If both inputs are valid:
// 1. Final Price: Display the final price after applying the discount in dollars.
// 2.If any input is invalid:
// 1. Display an error message explaining that original price or discount percentage cannot be negative.
public class finalprice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Original price of product :-> ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the Discount :-> ");
        double discount = scanner.nextDouble();

        if (originalPrice < 0 || discount < 0) {
            System.out.println("Error: Original price and discount cannot be Negative.");
        } else {
            double discountAmount = (originalPrice * discount) / 100;
            double finalprice = originalPrice - discountAmount;

            System.out.println("Final Price after applying the discount :-> " + finalprice);
        }

        scanner.close();
    }
}
