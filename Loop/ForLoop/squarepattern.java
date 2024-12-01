import java.util.Scanner;

public class squarepattern {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number :-> ");
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print(i);
        }
        System.out.println();
    }
    
    scanner.close();
    }
}
