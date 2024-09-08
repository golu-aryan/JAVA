import java.util.Scanner;

//Write a program to Calculate the total cost of hotel amenities
//Compute the total cost for using various hotel amenities(gym, pool, spa) charged per day.
public class HotelAmenities {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter number of days you used amenities : ");
        int days = n.nextInt();

        System.out.print("Enter Daily cost of Gym Amenities : ");
        double gym = n.nextDouble();

        System.out.print("Enter Daily cost of pool Amenities :");
        double pool = n.nextDouble();

        System.out.print("Enter Daily cost of spa amenities :");
        double spa = n.nextDouble();

        double totalgymCost = days * gym;
        double totalpoolCost = days * pool;
        double totalspaCost = days * spa;

        double totalAmenitiesCost = totalgymCost + totalpoolCost + totalspaCost;

        System.out.print("Your total cost of using Hotel Amenities is :" + totalAmenitiesCost);
        n.close();
    }
}
