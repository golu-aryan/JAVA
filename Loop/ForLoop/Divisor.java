import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        System.out.println("Divisor of " + n + " are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
