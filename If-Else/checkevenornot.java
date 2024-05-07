/*write a program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd. */
import java.util.Scanner;

public class checkevenornot {
    public static void main(String[] args) {
        int n;
        Scanner q = new Scanner(System.in);
        System.out.println("Enter the input:");
        n = q.nextInt();

        if (n % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        q.close();
    }
}
