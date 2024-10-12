import java.util.Scanner;

public class annualsalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlySalary = 0, yearlySalary, bonus;
        String PerformanceRating;

        System.out.print("Do You want to calculate annual salary and Performance [yes/no] :-> ");
        String userchoice = scanner.nextLine();

        while (userchoice.equalsIgnoreCase("yes")) {

            System.out.print("Enter your Monthly Salary :-> ");
            monthlySalary = scanner.nextDouble();
            scanner.nextLine();

            if (monthlySalary <= 0) {
                System.out.println("Invalid input. Monthly Salary must be greater than 0");
                continue;
            }

            yearlySalary = monthlySalary * 12;

            System.out.println("---Performance Rating Criteria---");
            System.out.println("E: Excellent");
            System.out.println("V: Very Good");
            System.out.println("G: Good");
            System.out.println("B: Below Average");
            System.out.println("Enter Teacher's Performance Rating");
            PerformanceRating = scanner.nextLine();

            switch (PerformanceRating.toLowerCase()) {
                case "e", "excellent":
                    bonus = yearlySalary * 0.20;
                    break;

                case "v", "very good":
                    bonus = yearlySalary * 0.10;
                    break;

                case "g", "good":
                    bonus = yearlySalary * 0.05;
                    break;

                case "b", "below average":
                    bonus = 0;
                    System.out.println("Sry,No Bonus");
                    break;

                default:
                    System.out.println("Sry! you entered Invalid input. Please Choose valid rating.");
                    continue;
            }

            System.out.println("Your Yearly salary : " + yearlySalary);
            System.out.println("Your Bonus : " + bonus);

            System.out.print("If you want to Calculate again choose [yes/no] :-> ");
            userchoice = scanner.nextLine();
            
            if (userchoice.equalsIgnoreCase("no")) {
                break;
            }

        }
        scanner.close();
    }
}
