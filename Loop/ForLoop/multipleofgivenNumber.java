import java.util.Scanner;

public class multipleofgivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :-> ");
        int n = scanner.nextInt();

        System.out.print("Enter Upper Limit :-> ");
        int limit = scanner.nextInt();

        for (int i = n; i <= limit; i += n) {
            // if (i % n == 0) {
            System.out.println(i);
            // }
        }

        scanner.close();
    }
}