import java.util.Scanner;

public class concatenateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first String :-> ");
        String first = scanner.nextLine();

        System.out.print("Enter second String :-> ");
        String second = scanner.nextLine();

        if (first.isEmpty() || second.isEmpty()) {
            System.out.println("String cannot be empty");
        } else {
            System.out.println(first.concat(" " + second));
        }

        scanner.close();
    }
}