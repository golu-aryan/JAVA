import java.util.Scanner;
//Write a program to Determine the unit price of an item from its total cost and quantity purchased
public class unitprice {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        System.out.print("Enter total price of product : ");
        float ttlPrice = n.nextFloat();

        System.out.print("Enter quantity of items purchased :");
        int quantity = n.nextInt();

        double unitprice = ttlPrice/quantity;

        System.out.print("The unit price of your product is : " + unitprice);
        n.close();

    }
}
