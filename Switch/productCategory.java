import java.util.Scanner;

public class productCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Product Category [Electronics, Apparel, Home & kitchen, Books, Beauty] :-> ");
        String category = scanner.nextLine();

        switch (category.toLowerCase()) {
            case "electronics":
                System.out.println("you can return Electronics items within 30 days of delievery");
                break;
            case "apparel":
                System.out.println("Apparel items can be returned within 15 days of delivery");
                break;
            case "home & kitchen":
                System.out.println("Home & Kitchen items are eligible for returns within 30 days of delivery");
                break;
            case "books":
                System.out.println("Books can be returned within 14 days of delivery, provided they are unopened");
                break;
            case "beauty":
                System.out.println(
                        "Beauty products can only be returned if they are unopened and within 7 days of delivery.");
                break;
            default:
                System.out.println("Invalid Category. Please enter a valid Product Category");
                break;
        }

        scanner.close();
    }
}
