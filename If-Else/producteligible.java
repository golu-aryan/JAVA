import java.util.Scanner;

public class producteligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter How many days have passed since the product was purchased :-> ");
        int days = scanner.nextInt();
        scanner.nextLine();

        if (days < 0) {
            System.out.println("Error : Number should be a non-negative integer");
        } else {
            System.out.print("Enter condition of the Product [New/Used/Damaged] :-> ");
            String condition = scanner.nextLine();

            if (condition.equalsIgnoreCase("New")) {
                if (days <= 30) {
                    System.out.println("The product is eligible for return");
                } else {
                    System.out.println("The product is not eligible fo return");
                }
            } else if (condition.equalsIgnoreCase("Used")) {
                if (days <= 15) {
                    System.out.println("The product is eligible for return");
                } else {
                    System.out.println("The product is not eligible fo return");
                }
            } else if (condition.equalsIgnoreCase("Damaged")) {
                System.out.println("It is not eligible for return at any time");
            } else {
                System.out.println("Sry! Invalid Input, Please enter [New/Used/Damaged]");
            }
        }
        scanner.close();
    }
}