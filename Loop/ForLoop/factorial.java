import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter number to calculate its factorial :-> ");
    int n = scanner.nextInt();

    long factorial = 1;
    for(int i = 1; i <= n; i++) {
        factorial *= i;
    }
    System.out.println("Factorial of " + n + " is :-> " + factorial);
    scanner.close();
    }
}
