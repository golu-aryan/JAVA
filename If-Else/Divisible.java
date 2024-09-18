// Check if a Number is Divisible by 5 
// and 11
// Write a Java program that checks whether a given number 
// is divisible by both 5 and 11.

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number :");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is Divisible by both 5 and 11 :) ");
        } else {
            System.out.println("The numer is not Divisible by both 5 and 11 :(");
        }

        scanner.close();
    }
}
