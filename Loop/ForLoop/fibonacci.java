import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0, second = 1;

        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(first + " ");
            }
            if (i == 2) {
                System.out.print(second + " ");
            }

            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
            scanner.close();
    }
}