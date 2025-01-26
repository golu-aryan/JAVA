import java.util.Scanner;
//Write a program to Convert the price of a product from USD to INR currency using a fixed exchange rate.

public class USD_INR {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your product price : $");
        double USDprice = n.nextDouble();

        double INRprice = USDprice * 83.50;
        System.out.println("The price of product in INR is : " + INRprice);
        n.close();
    }
}
