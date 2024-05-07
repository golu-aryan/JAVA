/*write a program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number/ */

import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int q = in.nextInt();
        int w = in.nextInt();
        int e = in.nextInt();
        System.out.println("Enter a boolean value(true/false):");
        boolean xyz = in.nextBoolean();

        System.out.println("The result is: " + test(q, w, e, xyz));
        System.out.println("\n");
        in.close();
    }
    public static boolean test(int p, int q, int r, boolean xyz) {
        if (xyz)
            return (r > q);
        return (q > p && r > q);

    }
}
