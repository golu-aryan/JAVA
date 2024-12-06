import java.util.Scanner;

public class sumofDivisibleby3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all numbers divisible by 3 and 5 are :-> " + sum);
        scanner.close();
    }
}