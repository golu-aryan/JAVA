import java.util.Scanner;

public class sumofAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        avg = (double) sum / n;

        System.out.println("The average of the first N natural number is :-> " + avg);

        scanner.close();
    }
}
