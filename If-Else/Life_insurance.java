import java.util.Scanner;

public class Life_insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age :-> ");
        int age = scanner.nextInt();

        if (age < 0 || age > 150) {
            System.out.println("Invalid age entered. Please enter a valid age between 0 and 150");
        } else if (age < 18) {
            System.out.println("you are too young to apply for life insurance.");
        } else if (age >= 18 && age <= 60) {
            System.out.println("you are eligible for life insurance.");
        } else if (age > 60) {
            System.out.println("you are too old to apply for life insurance.");
        }

        scanner.close();
    }
}
