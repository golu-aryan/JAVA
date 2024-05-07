/*write a program to print sum of digit*/
import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        int  n, r, sum = 0;
        Scanner q = new Scanner(System.in);

        System.out.println("Enter the number:");
        n = q.nextInt();

        while (n > 0 ) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("Sum of Digits = " + sum);
        q.close();
    }
}
