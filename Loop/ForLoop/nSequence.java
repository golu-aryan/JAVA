import java.util.Scanner;

public class nSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }

        scanner.close();
    }
}
