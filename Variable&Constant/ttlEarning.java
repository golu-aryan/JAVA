import java.util.Scanner;

//Write a program to compute the total earning from Room Booking Fees
//Calculate the total earnings for a hotel from multiple room bookings with different rates.
public class ttlEarning {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        System.out.print("Enter Booking Fee for Room 1 :");
        double room1 = n.nextDouble();

        System.out.print("Enter Booking Fee for Room 2 :");
        double room2 = n.nextDouble();

        System.out.print("Enter Booking Fee for Room 3 :");
        double room3 = n.nextDouble();

        double ttlEarning = room1+room2+room3;

        System.out.println("The total earnings from room booking are : " + ttlEarning);
        n.close();
    }
}
