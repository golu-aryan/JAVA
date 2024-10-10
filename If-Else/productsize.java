import java.util.Scanner;

public class productsize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product Type [Clothing, Footwear, Accessories] :-> ");
        String productType = scanner.nextLine();

        if (productType.equalsIgnoreCase("Clothing")) {
            System.out.print("Enter size [S/M/L/XL] :-> ");
            String size = scanner.nextLine();
            if (size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L")
                    || size.equalsIgnoreCase("XL")) {
                System.out.println("The selected size is available for clothing");
            } else {
                System.out.println("Invalid size. Available sizes for clothing are S,M,L,XL");
            }
        } else if (productType.equalsIgnoreCase("Footwear")) {
            System.out.print("Enter size [S/M/L] :-> ");
            String size = scanner.nextLine();
            if (size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L")) {
                System.out.println("The selected size is available for Footwear");
            } else if (size.equalsIgnoreCase("XL")) {
                System.out.println("Size XL is not available for Footwear");
            } else {
                System.out.println("Invalid size. Available sizes for Footwear are S,M,L");
            }
        } else if (productType.equalsIgnoreCase("Accessories")) {
            System.out.println("Size selection is not needed for Accessories");
        } else {
            System.out.println("Error : Invalid Product Type. Please Enter clothing, Footwear, Accessories");
        }

        scanner.close();
    }
}
