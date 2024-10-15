import java.util.Scanner;

public class calculatetuitionfee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjects = 0;
        int attempts = 0;
        double feeperSubj = 1000;
        int totalfee = 0;
        double finalfee;
        System.out.print("Do you want to calculate tuition fee for academic year [y/n] :-> ");
        String userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter number of subjects :-> ");
            if (scanner.hasNextInt()) {
                subjects = scanner.nextInt();
                scanner.nextLine();

                if (subjects > 0) {
                    totalfee = (int) feeperSubj * subjects;
                } else {
                    System.out.println("Number of Subjects must be a positive integer");
                    continue;
                }
            } else {
                System.out.println("Invalid input! Please enter a positive integer");
            }
            attempts++;
            if (attempts == 3) {
                System.out.println("Too many failed attempts. Exiting...");
                break;
            }

            System.out.print("Is student a Scholarship holder? [y/n] :-> ");
            String scholarship = scanner.nextLine();

            if (scholarship.equalsIgnoreCase("y")) {
                finalfee = totalfee * 0.90;
            } else if (scholarship.equalsIgnoreCase("n")) {
                finalfee = totalfee;
            } else {
                System.out.println("Invalid input. Please Enter valid input");
                continue;
            }

            System.out.println("Number of subjects : " + subjects);
            System.out.println("Total tuition fee before discount : " + totalfee);
            System.out.println("ScholarShip holder : " + (scholarship.equals("y") ? "yes" : "no"));
            System.out.println("Tuition Fee After Discount : " + finalfee);
            break;
        }
        scanner.close();
    }
}
