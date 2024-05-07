
/*write a program to check the given number is palindrome or not */
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (n == rev) {
            System.out.println("The given no is palindrome" + rev);
        } else {
            System.out.println("The given no is not palindrome" + rev);
        }
        t.close();
    }
}
