import java.util.Scanner;

public class ThrowInvalidEdge {
    public static void isValid(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Please enter Age between 0 and 100");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Age :-> ");
            int age = scanner.nextInt();

            isValid(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The Exception is Clear");
            scanner.close();
        }
    }
}
