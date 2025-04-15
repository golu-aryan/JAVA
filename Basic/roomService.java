package JAVA.Basic;
import java.util.Scanner;

//Write a program to calculate the total charges for different room service items (food, beverages) ordered.
public class roomService {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter price of food item 1 : ");
        double fooditem1 = n.nextDouble();

        System.out.print("Enter price of food item 2 : ");
        double fooditem2 = n.nextDouble();
        System.out.println("-----------------------------------");
        System.out.print("Enter price of beverage 1: ");
        double beverage1 = n.nextDouble();

        System.out.print("Enter price of beverage 2: ");
        double beverage2 = n.nextDouble();

        double totalcharge = fooditem1 + fooditem2 + beverage1 + beverage2;
        
        System.out.println("-----------------------------------");

        System.out.println("The total charge of Room Services is :" + totalcharge);
        n.close();
    }
}
