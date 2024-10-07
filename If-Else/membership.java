import java.util.Scanner;

public class membership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age :-> ");

        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Age must be a positive integer");
            } else if (age >= 18 && age < 100) {
                System.out.println("Congratulations! You qualify for Amazon Prime MemberShip");
            } else {
                System.out.println("Sorry,You must be at least 18 years old to apply for Amazon Prime Membership");
            }
        } else {
            System.out.println("Error : Please enter a valid age as a whole number");
        }
        scanner.close();
    }
}