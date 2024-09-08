//Write a program to calculate loyality points earned based on the total amount spent.

import java.util.Scanner;

public class loyalitypoints {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double points = 0.1; 

        System.out.println("Enter the total amount spent :");
        double totalAmountSpent = t.nextDouble();

        double loyality = totalAmountSpent * points;

        System.out.println("Loyalty points earned: " + loyality);
        t.close();
    }
}
