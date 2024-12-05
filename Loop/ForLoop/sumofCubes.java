import java.util.Scanner;

public class sumofCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sumofCubes = 0;

        System.out.print("Enter number :-> ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sumofCubes += Math.pow(i, 3);
        }
        System.out.println("The sum of Squares of the first " + n + " Natural number is : " + sumofCubes);
        scanner.close();
    }
}
