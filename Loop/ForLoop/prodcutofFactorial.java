import java.util.Scanner;

public class prodcutofFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1, prodcutofFactorial = 1;

        System.out.print("Enter a number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            prodcutofFactorial *= factorial;
        }
        System.out.println("The product of Factorial is -> " + prodcutofFactorial);
        scanner.close();
    }
}
