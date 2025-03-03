import java.util.Scanner;

public class furnitureMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        furniture furniture = new furniture();
        System.out.print("Enter Name of Furniture :-> ");
        furniture.Name = scanner.nextLine();

        System.out.print("Enter Furniture Material :-> ");
        furniture.Material = scanner.nextLine();

        System.out.print("Enter furniture Price :-> ");
        furniture.Price = scanner.nextFloat();

        System.out.print("Enter furniture Weight :-> ");
        furniture.Weight = scanner.nextFloat();

        System.out.println("------ The Furniture Details ------");
        System.out.println("Name :> " + furniture.Name);
        System.out.println("Material :> " + furniture.Material);
        System.out.println("Price :> " + furniture.Price);
        System.out.println("Weight :> " + furniture.Weight);

        scanner.close();
    }
}
