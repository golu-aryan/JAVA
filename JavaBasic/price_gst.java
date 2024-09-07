import java.util.Scanner;

//Write a program to Accept the price and GST rate of a product.
//Calculate the total price including tax.
public class price_gst {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String product;

        System.out.print("Enter Product Name :");
        product = n.nextLine();

        System.out.print("Enter price of product : ");
        double price = n.nextDouble();

        System.out.print("Enter GST rate (in percentage) :");
        double gstrate = n.nextDouble();

        double gstAmount = (price * gstrate) / 100;

        double ttlprice = price + gstAmount;

        System.out.println("Your Product : " + product);

        System.out.println("Your product price is : " + price);

        System.out.println("Your GST rate : " + gstrate);

        System.out.println("GST Amount : " + gstAmount);
        
        System.out.println("your total price of product is :" + ttlprice);

        n.close();
    }
}
