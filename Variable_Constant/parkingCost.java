import java.util.Scanner;

//Write a program to calculate the total costing of parking services.
//Determine the total cost for using parking services based on the number of days.
public class parkingCost {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("Enter the number of days you used the parking service:");
        int days = w.nextInt();

        System.out.println("Enter the daily cost of parking:");
        double dailyParkingCost = w.nextDouble();

        double totalParkingCost = days * dailyParkingCost;

        System.out.println("The total cost for parking services is: " + totalParkingCost);
        w.close();  
    }
}
