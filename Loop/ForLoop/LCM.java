import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        System.out.print("Enter first number :-> ");
        int a = scanner.nextInt();
        int A = a;

        System.out.print("Enter second number :-> ");
        int b = scanner.nextInt();
        int B = b;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        int lcm = (A * B) / gcd;

        System.out.println("The LCM of " + A + " and " + B + " is :-> " + lcm);
        scanner.close();
    }
}
