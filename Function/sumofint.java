/*write a program to calculate the sum of two integers and return true if the sum is equal to a third integer. */
import java.util.Scanner;

public class sumofint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = in.nextInt();

        System.out.println("Enter the second number:");
        int b = in.nextInt();

        System.out.println("Enter the third number:");
        int c = in.nextInt();

        System.out.println("The result is: " + sumoftwo(a, b, c));

        in.close();
        System.out.println("\n");
    }
    public static boolean sumoftwo(int p, int q, int r) {
        return((p + q) == r || (q + r) == p || (p + r) == q);
    }
} 
