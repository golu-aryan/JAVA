import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber, endingNumber;

        System.out.print("Enter starting Number :-> ");
        startingNumber = scanner.nextInt();

        System.out.print("Enter ending number :-> ");
        endingNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = startingNumber; j <= endingNumber; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}