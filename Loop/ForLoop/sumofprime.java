import java.util.Scanner;

public class sumofprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumofprime = 0;
        System.out.print("Enter a number :-> ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sumofprime += i;
            }
        }
        System.out.println("The sum of prime numbers are :-> " + sumofprime);
        scanner.close();
    }
}
