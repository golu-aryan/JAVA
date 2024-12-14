import java.util.Scanner;

public class sumofSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sumofSquare = 0;
        System.out.print("Enter number :-> ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sumofSquare += Math.pow(i, 2);
        }
        System.out.println("The sum of Squares of the first " + n + " Natural number is : " + sumofSquare);
        scanner.close();
    }
}
