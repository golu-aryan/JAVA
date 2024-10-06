import java.util.Scanner;
// You are tasked with developing a feature for an e-commerce platform (e.g., Amazon) to determine if a user qualifies for 
// free shipping based on the total amount in their shopping cart.
// Write a program that:
// 1.Takes the total cart amount as input from the user.
// 2.Checks if the user is eligible for free shipping. Free shipping is offered if the total cart amount is greater than Rs. 50.
// 3.Displays an appropriate message to inform the user whether or not they qualify for free shipping.
// Requirements:
// Input:
// •A positive decimal number representing the total cart amount.
// Output:
// •If the total cart amount is greater than Rs. 50, display:
// "You qualify for free shipping!"
// •If the total cart amount is Rs. 50 or less, display:
// "You do not qualify for free shipping. Add more items to your cart to reach Rs. 50 and get free shipping."
// Validation:
// •The input must be a positive number (greater than zero).
// •If the input is negative or zero, display an error message:
// "Invalid amount. Please enter a positive number greater than zero."
public class carAmount {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter Total Car Amount (in Rs) :-> ");
    double totalAmount = scanner.nextDouble();
    

    if (totalAmount <= 0) {
        System.out.println("Invalid Amount, Please enter positive number.");
    } else if (totalAmount > 50) {
        System.out.println("You qualify for free shipping!");
    } else {
        System.out.println("You do not qualify for free shipping. Add more items to your cart to reach Rs. 50 and get free shipping");
    }
    scanner.close();
    }
}
