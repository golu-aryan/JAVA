import java.util.Scanner;

public class printSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter number :-> ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}