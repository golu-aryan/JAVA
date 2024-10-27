import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, sum = 0, n;
        System.out.print("Enter number :-> ");
        n = scanner.nextInt();
        for (i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of " + n + " odd numbers is:-> " + sum);
        scanner.close();
    }
}