//Check if a Passenger is Eligible for Child Fare
//Write a Java program that takes the age of a passenger as input and checks whether the passenger is 
//eligible for child fare. If the age is below 12, print that the passenger is eligible for a child fare.
//If the age is between 12 and 18, print that they need to pay half fare, and for others, 
//print that full fare is applicable

import java.util.Scanner;

public class childFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age :");
        int age = scanner.nextInt();


        if (age < 12) {
            System.out.println("The Passenger is eligible for a Child Fare.");
        } else if (age >= 12 && age <= 18) {
            System.out.println("They need to pay Half Fee ");
        } else {
            System.out.println("Full Fare is Applicable");
        }
        scanner.close();
    }
}
