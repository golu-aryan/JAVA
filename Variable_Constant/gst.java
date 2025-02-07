import java.util.Scanner;
//write a program to accept the price of a product and the GST rate
//print the final price including gst
public class gst {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);

        System.out.print("Enter price of product :");
        double price = y.nextDouble();

        System.out.print("Enter GST rate :");
        double gstrate = y.nextDouble();

        double gstamount = (price * gstrate)/100;
        System.out.println("GST Amount is :"+gstamount);

        double finalprice = price + gstamount;

        System.out.print("Final price is :"+finalprice);
        y.close();
    }
}
