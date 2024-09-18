//Write a program that takes the age of a person and determines if they are eligible for senior citizen 
//benefits (age >= 60)

import java.util.Scanner;

public class personEligible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of a person : ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("You're eligible for senior citizen Benefits");
        } else {
            System.out.println("Sry! you're not eligible for Senior citizen benefits.");
        }
        scanner.close();
    }
}
