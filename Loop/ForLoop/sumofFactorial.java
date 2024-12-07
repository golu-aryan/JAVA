import java.util.Scanner;

public class sumofFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1, sum = 0;
        System.out.print("Enter a number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println("The sum of Factorials of number is :-> " + sum);
        scanner.close();
    }
}
