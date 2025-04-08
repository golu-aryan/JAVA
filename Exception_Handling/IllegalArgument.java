import java.util.Scanner;
public class IllegalArgument {
    public static void isValidAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Your age must be between 1 and 100");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int age;
            System.out.print("Enter Your Age :-> ");
            age = scanner.nextInt();
            isValidAge(age);
            System.out.println("Your Age is :-> " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Your Exception Occured " + e.getMessage());
        } finally {
            scanner.close();
        }

        scanner.close();
    }
}
