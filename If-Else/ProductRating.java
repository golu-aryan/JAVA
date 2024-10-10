import java.util.Scanner;

public class ProductRating {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter Product ID :-> ");
    String productID = scanner.nextLine();

    if (productID.equals(" ")) {
        System.out.println("Error : ProductID cannot be empty");
    } else {
        System.out.print("Enter product rating ( 1 to 5 stars) :-> ");
        int rating = scanner.nextInt();

        if (rating < 1 || rating > 5) {
            System.out.println("Error : Invalid rating. Please enter rating between 1 and 5");
        } else {
            System.out.println("The product " + productID + " has a rating of " + rating + "stars");
        }
    }
    
    scanner.close();
    }
}
