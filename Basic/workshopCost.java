package JAVA.Basic;
import java.util.Scanner;
//Write a program to Calculate cost of conducting a workshop
//Compute the total cost for conducting a workshop including materials, refreshments and honorarium
public class workshopCost { 
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter cost for materials : ");
        int materialCost = n.nextInt();

        System.out.print("Enter cost for refreshments : ");
        int refreshmentsCost = n.nextInt();

        System.out.print("Enter honorarium cost :");
        int honorariumCost = n.nextInt();

        double totalCost = materialCost+refreshmentsCost+honorariumCost;

        System.out.println("The Total Cost for conducting the workshop is :" + totalCost);
        n.close();
    }
}
