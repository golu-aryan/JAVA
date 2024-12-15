import java.util.Scanner;

public class sumofEvenFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1, sumofFactorial = 0;
        System.out.print("Enter a number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;

            if (i % 2 == 0) {
                sumofFactorial += factorial;
            }
        }
        System.out.println("The sum of Factorial of even number is :-> " + sumofFactorial);
        scanner.close();
    }
}
