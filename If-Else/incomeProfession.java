import java.util.Scanner;

public class incomeProfession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Profession [Salaried, Self-Employeed, Student, Retired, Business Owner] :-> ");
        String profession = scanner.nextLine();

        double monthly, annual;
        boolean isEligible = false;

        if (profession.equalsIgnoreCase("Salaried")) {
            System.out.print("Enter your monthly income :-> ");
            monthly = scanner.nextDouble();
            if (monthly >= 25000) {
                isEligible = true;
            }
        } else if (profession.equalsIgnoreCase("self-employeed")) {
            System.out.print("Enter your annual income :-> ");
            annual = scanner.nextDouble();
            if (annual >= 300000) {
                isEligible = true;
            }
        } else if (profession.equalsIgnoreCase("Student")) {
            isEligible = false;
        } else if (profession.equalsIgnoreCase("Retired")) {
            System.out.print("Enter your monthly income :-> ");
            monthly = scanner.nextDouble();
            if (monthly >= 15000) {
                isEligible = true;
            }
        } else if (profession.equalsIgnoreCase("business owner")) {
            System.out.print("Enter your annual income :-> ");
            annual = scanner.nextDouble();
            if (annual >= 400000) {
                isEligible = true;
            }
        }
        if (isEligible) {
            System.out.println("you're eligible for a credit card");
        } else {
            System.out.println("You're not eligible for credit card");
        }

        scanner.close();
    }
}
