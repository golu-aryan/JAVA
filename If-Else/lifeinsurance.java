import java.util.Scanner;

public class lifeinsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter Your Age :-> ");
        age = scanner.nextInt();

        if (age < 0) {
            System.out.println("ERROR: Age Cannot be Negative!");
        } else if (age < 18) {
            System.out.println("Not Eligible for Insurance.");
        } else if (age >= 18 && age <= 30) {
            System.out.println("Premium  = 5,000.0");
        } else if (age >= 31 && age <= 45) {
            System.out.println("Premium = 7,500.0");
        } else if (age >= 46 && age <= 60) {
            System.out.println("Premium = 10,000.0");
        } else {
            System.out.println("Premium = 15,000.0");
        }
        scanner.close();
    }
}