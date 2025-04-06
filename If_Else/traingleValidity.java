// Triangle Validity Check
// Write a Java program to check whether three given sides 
// can form a valid triangle. For a triangle to be valid, the sum 
// of any two sides should be greater than the third side

import java.util.Scanner;

public class traingleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter 2nd side : ");
        int side2 = scanner.nextInt();

        System.out.print("Enter 3rd side : ");
        int side3 = scanner.nextInt();

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("valid triangle.");
        } else {
            System.out.println("Invalid triangle.");
        }
        scanner.close();
    }
}
