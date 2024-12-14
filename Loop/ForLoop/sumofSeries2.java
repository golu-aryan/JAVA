import java.util.Scanner;

public class sumofSeries2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the Number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("The sum of Series is :-> " + sum);
        scanner.close();
    }
}