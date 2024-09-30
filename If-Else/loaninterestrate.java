import java.util.Scanner;

public class loaninterestrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan type");
        System.out.println("1.  Home");
        System.out.println("2.  Personal");
        System.out.println("3.  Car");
        System.out.print("Choose your Loan :-> ");
        String loan = scanner.nextLine();

        if (loan.equalsIgnoreCase("Home")) {
            System.out.println("The interest rate for a Home Loan is 7.5% ");
        } else if (loan.equalsIgnoreCase("Personal")) {
            System.out.println("The interest rate for a Personal Loan is 12.0% ");
        } else if (loan.equalsIgnoreCase("Car")) {
            System.out.println("The interest rate for a Car Loan is 9.0% ");
        } else {
            System.out.println("Error : The Loan type " + loan + " is not recognized ");
        }
        scanner.close();
    }
}
