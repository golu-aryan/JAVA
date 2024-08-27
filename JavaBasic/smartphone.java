import java.util.Scanner;

public class smartphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double price, ttlprice;
        int units;

        System.out.print("Enter your name : ");
        name = sc.nextLine();

        System.out.print("Enter price of smartphone : ");
        price = sc.nextDouble();

        System.out.print("Enter number of units the customer wants to buy : ");
        units = sc.nextInt();

        ttlprice = price * units;

        System.out.print("Your name is -- " + name + " and the total amount you have to pay for the smartphone is :- " + ttlprice);

        sc.close();
    }
}
