import java.util.Scanner;
//Write a program to calculate the total price for three different items, each with a different discount rate.

public class discount {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter price of 1 item : ");
        double item1 = n.nextDouble();
        System.out.print("Enter discount for 1 item : ");
        double discount1 = n.nextDouble();

        System.out.println("-----------------------------");

        System.out.print("Enter price of 2 item : ");
        double item2 = n.nextDouble();
        System.out.print("Enter discount for 2 item : ");
        double discount2 = n.nextDouble();

        System.out.println("-----------------------------");

        System.out.print("Enter price of 3 item : ");
        double item3 = n.nextDouble();
        System.out.print("Enter discount for 3 item : ");
        double discount3 = n.nextDouble();

        double finalprice1 = item1 - (item1 * discount1) / 100;
        double finalprice2 = item2 - (item2 * discount2) / 100;
        double finalprice3 = item3 - (item3 * discount3) / 100;

        System.out.println("------------------------------------");

        System.out.println("Your final price of 1 item is : " + finalprice1);
        System.out.println("Your final price of 2 item is : " + finalprice2);
        System.out.println("Your final price of 3 item is : " + finalprice3);

        double totalprice = finalprice1 + finalprice2 + finalprice3;

        System.out.print("The total price of your three items with discount is :" + totalprice);

        n.close();
    }
}
