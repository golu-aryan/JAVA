/*write a program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd. */
import java.util.Scanner;
// Simple Calculator using if-else
// Write a Java program that acts as a simple calculator. The user will input two numbers and
// an operator (+, -, *, /), and the program will output the result of the operation. Handle 
// division by zero as a special case. 


public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers and an operator
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        // Closing the scanner
        scanner.close();
    }
}


