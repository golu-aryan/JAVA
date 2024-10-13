import java.util.Scanner;

public class canteenbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double itemprice, finalbill = 0;
        int quantity;

        while (true) {
            System.out.print("Enter price of item :-> ");

            if (scanner.hasNextDouble()) {
                itemprice = scanner.nextDouble();

                if (itemprice <= 0) {
                    System.out.println("Invalid price! price must be greate than 0");
                    continue;
                }
            } else {
                System.out.println("Invalid input! please enter a valid price");
                scanner.next();
                continue;
            }

            System.out.print("Enter the quantity ordered :-> ");
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity! Quantity must be greater than 0");
                    continue;
                }
            } else {
                System.out.println("Invalid input! Please input valid quantity");
                scanner.nextLine();
                continue;
            }

            double totalCost = itemprice * quantity;
            finalbill += totalCost;

            System.out.println("Do you want to add more items? [y/n] :-> ");
            scanner.nextLine();
            String userchoice = scanner.nextLine();

            if (userchoice.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Total Bill Amount : " + finalbill);
        scanner.close();
    }
}
