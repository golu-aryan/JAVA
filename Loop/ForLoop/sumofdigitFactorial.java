import java.util.Scanner;

public class sumofdigitFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1, sumofdigit = 0, digit;
        System.out.print("Enter a number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        while (factorial > 0) {
            sumofdigit += factorial % 10;
            factorial /= 10;
        }

        System.out.println("The sum of digits of the factorial is: " + sumofdigit);
        scanner.close();
    }
}
