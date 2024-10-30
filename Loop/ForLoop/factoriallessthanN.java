import java.util.Scanner;

public class factoriallessthanN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Enter a number :-> ");
        int n = scanner.nextInt();

        for (int i = 1; factorial < n; i++) {
            System.out.println(i + "! = " + factorial);
            factorial *= (i+1);
        }
        System.out.println("The factorial is :-> " + factorial);
        scanner.close();
    }
}
