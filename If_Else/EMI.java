import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Loan Amount :-> ");
        double amount = scanner.nextDouble();

        System.out.print("Enter Duration of Loan in months :-> ");
        int term = scanner.nextInt();

        System.out.print("Enter annual interest rate as percentage :-> ");
        double annualinterest = scanner.nextDouble();

        double monthlyInterestRate = (annualinterest / 12) / 100;

        double EMI = (amount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, term)) /
                (Math.pow(1 + monthlyInterestRate, term) - 1);

        double totalAmount = EMI * term;
        double totalInterest = totalAmount - amount;

        System.out.println("EMI Amount : " + EMI);
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Total Interest : " + totalInterest);

        scanner.close();
    }
}