import java.util.Scanner;

public class smalln {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, v;
        System.out.println("Enter the first number:\n");
        n = q.nextInt();

        System.out.println("Enter second number:\n");
        v = q.nextInt();

        System.out.println("Enter third number:\n");
        int w = q.nextInt();

        System.out.println("The smallest value is" + smallest(n, v, w) + "\n");
    }
    public static int smallest(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }
}
