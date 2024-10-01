import java.util.Scanner;

public class chequebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your account type (Savings, Current, Salary, Business): ");
        String accountType = scanner.nextLine();

       
        boolean isEligible = false;

        switch (accountType.toLowerCase()) {
            case "savings":
                System.out.print("Enter your current balance : ");
                double savingsBalance = scanner.nextDouble();
                if (savingsBalance >= 1000) {
                    System.out.println("You are eligible for 1 free cheque book per year.");
                    isEligible = true;
                } else {
                    System.out.println("You must maintain a minimum balance of ₹1,000 to be eligible for a cheque book.");
                }
                break;

            case "current":
                System.out.println("You are eligible for unlimited cheque books.");
                isEligible = true;
                break;

            case "salary":
                System.out.print("Has your salary been credited this month? (yes/no): ");
                String salaryCredited = scanner.nextLine().toLowerCase();

                if (salaryCredited.equals("yes")) {
                    System.out.println("You are eligible for 2 free cheque books per year.");
                    isEligible = true;
                } else {
                    System.out.println("You must have a monthly salary credited to be eligible for a cheque book.");
                }
                break;

            case "business":
                System.out.print("Have you provided proof of business registration? (yes/no): ");
                String businessProof = scanner.nextLine().toLowerCase();

                if (businessProof.equals("yes")) {
                    System.out.println("You are eligible for 3 free cheque books per year.");
                    isEligible = true;
                } else {
                    System.out.println("You must provide proof of business registration to be eligible for a cheque book.");
                }
                break;

            default:
                System.out.println("Invalid account type. Please enter a valid account type (Savings, Current, Salary, Business).");
        }

        if (isEligible) {
            System.out.println("You can now request a cheque book.");
        }
        scanner.close();
    }
}
