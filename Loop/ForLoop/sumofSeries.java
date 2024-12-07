import java.util.Scanner;

public class sumofSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("The sum of Series is :-> " + sum);
        scanner.close();
    }
}