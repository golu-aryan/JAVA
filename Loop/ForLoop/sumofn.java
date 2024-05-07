/*write a program to input the number by the user and print sum of their numbers
 */

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        int n, sum = 0, i;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = t.nextInt();

        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum of " + n + " Number are :" + sum);
        t.close();
    }
}