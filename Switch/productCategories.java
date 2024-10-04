import java.util.Scanner;
// Write a program that simulates a simplified product category selection process for an e-commerce platform. The user will 
// input a product type, and the program will display sub-categories for the selected type. The goal is to offer sub-category 
// options based on the chosen product type and handle invalid inputs effectively.
// Write a Java program that:
// 1.Input:
// 1. Prompt the user to input a product type (e.g., "Electronics", "Clothing", or "Groceries").
// 2. The program should only accept these three valid product types:
// 1. Electronics
// 2. Clothing
// 3. Groceries
// 2.Output:
// 1. For each valid product type, display relevant sub-categories:
// 1. Electronics: Sub-categories include "Mobiles", "Laptops", "Cameras".
// 2. Clothing: Sub-categories include "Men's Wear", "Women's Wear", "Kids' Wear".
// 3. Groceries: Sub-categories include "Fruits", "Vegetables", "Beverages".
// 3.Validation:
// 1. If the user inputs an invalid product type (anything other than "Electronics", "Clothing", or "Groceries"), the program 
// should display an appropriate error message indicating that the input is invalid.
// 4.Error Handling:
// 1. Ensure that the program is not case-sensitive, meaning that inputs like "electronics", "ELECTRONICS", and 
// "Electronics" should be treated the same.
// 2. If no input or an empty string is provided, display an error message asking the user to provide a valid input. •Valid Input Example: • Input: "Electronics" • Output: "Available sub-categories: Mobiles, Laptops, Cameras
public class productCategories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a product Type [Electronics, Clothing, Groceries] :-> ");
        String prodType = scanner.nextLine();

        if (prodType.equals(" ")) {
            System.out.println("Error: Please enter a valid input");
        } else {
            if (prodType.equalsIgnoreCase("Electronics")) {
                System.out.println("Available Sub-Categories : Mobiles, Laptops, Cameras");
            } else if (prodType.equalsIgnoreCase("Clothing")) {
                System.out.println("Available Sub-Categories : Men's Wear, Women's Wear, Kid's Wear");
            } else if (prodType.equalsIgnoreCase("Groceries")) {
                System.out.println("Available Sub-Categories : Fruits, Vegetables, Beverages");
            } else {
                System.out.println("Invalid Product Type. Please Enter [Electronics, Clothing, Groceries]");
            }
        }

        scanner.close();
    }
}
