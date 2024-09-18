import java.util.Scanner;
// Find the Maximum of Four Numbers 
// using Nested if-else
// Write a Java program that takes four numbers as input and prints 
// the largest number using nested if-else statements. 
public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st numbers :");
        int n1 = scanner.nextInt();
        System.out.print("Enter 2nd numbers :");
        int n2 = scanner.nextInt();
        System.out.print("Enter 3rd numbers :");
        int n3 = scanner.nextInt();
        System.out.print("Enter 4th numbers :");
        int n4 = scanner.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n1 > n4) {
                    System.out.println(n1 + " is maximum number ");
                } else {
                    System.out.println(n4 + " is maximum ");
                }
            } else {
                if (n3 > n4) {
                    System.out.println(n3 + " is maximum number ");
                } else {
                    System.out.println(n4 + " is maximum number ");
                }
            }
        } else {
            if (n2 > n3) {
                if (n2 > n4) {
                    System.out.println(n2 + " is maximum number ");
                } else {
                    System.out.println(n4 + " is maximum number");
                }
            } else {
                if (n3 > n4) {
                    System.out.println(n3 + " is maximum number ");
                } else {
                    System.out.println(n4 + " is maximum number ");
                }
            }
        }

        scanner.close();
    }
}
