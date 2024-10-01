import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double interestRate = 0;
        System.out.print("Enter FD Amount (in INR) :-> ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the duration of the FD amount (in years) :-> ");
        int duration = scanner.nextInt();

        if (amount <= 100000) {
            if (duration <= 1) {
                interestRate = 5.0;
            } else if (duration <= 3) {
                interestRate = 5.5;
            } else {
                interestRate = 6.0;
            }
        } else if (amount >= 100000 && amount <= 500000) {
            if (duration <=1 ) {
                interestRate = 6.0;
            } else if (duration <= 3) {
                interestRate = 6.5;
            } else {
                interestRate = 7.0;
            }
        } else {
            if (duration <= 1) {
                interestRate = 7.0;
            } else if (duration <= 3) {
                interestRate = 7.5;
            } else {
                interestRate = 8.0;
            }
        }

        System.out.println("For a Fixed Deposit Amount of " + amount + " INR for a duration of " + duration + " years, the applicable interest rate is " + interestRate);
        scanner.close();
    }
}
