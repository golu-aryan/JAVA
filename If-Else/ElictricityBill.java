import java.util.Scanner;
//Write a program to calculate the electricity bill based on the following condiitions:
//>>For the first time 100 units : ₹5 per Unit
//>>For the next 100 units: ₹6 per unit
//>>Above 200 units: ₹7 per unit
//>>Take the number of units as input from the user and calculate the total bill.
public class ElictricityBill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Units :");
        int units = scanner.nextInt();
        double totalBill = 0;

        if(units <= 100){
            System.out.println("For the 1 time 100 Units : 5 per Unit");
            totalBill = units*5;
        } else if(units <= 200){
            System.out.println("For the 2 time 100 Units : 5 per Unit");
            totalBill = (100 * 5) + (units - 100) * 6;
        } else{
            System.out.println("Above 200 Units : 7 per unit");
            totalBill = (100 * 5) + (100 * 6) + (units - 200) * 7;
        }

        System.out.println("Total Electricity Bill : " + totalBill);

        scanner.close();
    }
}
