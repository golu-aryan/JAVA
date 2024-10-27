import java.util.Scanner;

public class sumofeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, i;
        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of even Numbers from 1 to " + n + " is :-> " + sum);
        scanner.close();
    }
}
