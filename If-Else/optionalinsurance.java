import java.util.Scanner;
public class optionalinsurance {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double threshold = 100000;
    
    System.out.print("Enter price of product :-> ");
    double price = scanner.nextDouble();

    if (price <= 0) {
        System.out.println("Error : The price must be a positive number");
    } else if (price > threshold) {
        System.out.println("The product qualifies for optional insurance coverage");
    } else if (price <= threshold) {
        System.out.println("No insurance offer is available for lower-priced items");
    } else {
        System.out.println("Invalid input");
    }
    
    scanner.close();
    }
}
