/*Write a Java program to convert a string to an integer */
import java.util.Scanner;
import java.util.*;

public class convertstringtoint {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Enter the number(String):");

        String str1 = e.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d", result);

        System.out.println("\n");
    }
}
