import java.util.Scanner;
// You are tasked with developing a feature for an e-commerce website like Amazon, where customers can 
// check if a product is available for purchase. The system should take the product name and its stock status 
// as input and then determine whether the product is available. Additionally, the program must handle invalid 
// inputs by performing validation on both the product name and stock status.
// Requirements:
// 1.Input:
// •The user will input a product name (string).
// •The user will input the stock status (string), which can either be "Available" or "Out of Stock."
// 2.Output:
// •If the product is available (stock status is "Available"), the system should display:
// "Product <product_name> is available for purchase."
// •If the product is not available (stock status is "Out of Stock"), the system should display:
// "Product <product_name> is currently out of stock."
// 3.Validation:
// •The product name should not be empty. If the user provides an empty product name, display the 
// message:
// "Error: Product name cannot be empty."
// •The stock status must either be "Available" or "Out of Stock." If the user provides any other value, 
// display the message:
// "Error: Invalid stock status. Please enter 'Available' or 'Out of Stock'."
// 4.Error Handling:
// •The program should check both the product name and stock status for validity. If either input is invalid, 
// display the appropriate error message and do not proceed with the availability check
public class productavailableforpurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a product name :-> ");
        String productName = scanner.nextLine();

        if (productName.equals(" ")) {
            System.out.println("Error : Product name cannot be empty");
        }

        System.out.print("Enter stock status [Available / Out of stock] :-> ");
        String stockStatus = scanner.nextLine();
        if (!stockStatus.equalsIgnoreCase("Available") && !stockStatus.equalsIgnoreCase("Out of stock")) {
            System.out.println("Error : Invalid Stock status, Please enter [Available / Out of Stock]");
        } else if (stockStatus.equalsIgnoreCase("Available")) {
            System.out.println("Product : " + productName + " is available for purchase");
        } else {
            System.out.println("Product : " + productName + " is Currently out of stock");
        }
        scanner.close();
    }
}
