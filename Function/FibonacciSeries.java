import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int num) {
        if (num <= 1)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number :-> ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + ",");
        }

        scanner.close();
    }
}
