import java.util.Scanner;

public class reverseMultiplication {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number :-> ");
    int n = scanner.nextInt();
    
    for (int i= 10; i >= 1; i--) {
        int table = n * i;
        System.out.println(n + " x " + i + " = " + table);
    }
    scanner.close();
    }
}
