import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        int n, sum = 0, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The Sum of " + n + " Number are :" + sum);
        scanner.close();
    }
}