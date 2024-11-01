import java.util.Scanner;

public class sumofMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            sum += product;
            System.out.println(n + " x " + i + " = " + product);
        }
        System.out.println("Print the sum of the multiplication table of " + n + " is : " + sum);
        scanner.close();
    }
}
