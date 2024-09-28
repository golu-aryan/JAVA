import java.util.Scanner;

public class PolicyType {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a specific insurance policy type :");
        System.out.println("1>  Endowment Plan");
        System.out.println("2>  Term Plan");
        System.out.println("3>  Pension Plan");
        System.out.print("Enter your Plan options :-> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Endowment Plan:");
                System.out.println("    ->Provides insurance coverage and saving benefits.");
                System.out.println("    ->Policyholders receive a lump sum amount after the policy term or in the event of death.");
                break;

            case 2:
                System.out.println("Term Plan:");
                System.out.println("    ->Offers pure life insurance coverage with no saving benefits.");
                System.out.println("    ->High sum assured at low premium rates.");
                break;

            case 3:
                System.out.println("Pension Plan:");
                System.out.println("    ->Helps the policyholder build a retirement corpus.");
                System.out.println("    ->Provides a regular income post-retirement.");
                break;

            default:
                System.out.println("Invalid input. Please select a valid policy type (Endowment, Term, Pension).");
                break;
        }

        scanner.close();
    }
}
