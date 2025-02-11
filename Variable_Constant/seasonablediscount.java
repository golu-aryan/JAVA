import java.util.Scanner;

//Write a program to calculate price after applying a series of Discounts.
//Apply multiple discounts(e.g. seasonal and promotional discount) to the price of a product.
public class seasonablediscount {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter your price of product : ");
        double originalPrice = n.nextDouble();

        System.out.print("Enter seasonal discount : ");
        double seasonalDiscount = n.nextDouble();

        double afterSeasonal = originalPrice - (originalPrice * seasonalDiscount) / 100;

        System.out.print("Enter promotional discount : ");
        double promotionalDiscount = n.nextDouble();

        double afterPromotional = afterSeasonal - (afterSeasonal * promotionalDiscount) / 100;

        System.out.print("The final price after applying both discount is : " + afterPromotional);
        
        n.close();
    }
}
