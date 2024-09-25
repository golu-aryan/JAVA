import java.util.Scanner;

public class PaymentMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Insurance Premium Payment Mode ");
        System.out.println("1.  Annual");
        System.out.println("2.  Semi-Annual");
        System.out.println("3.  Quarterly");
        System.out.println("4.  Monthly");
        String mode = scanner.nextLine().toLowerCase();

        switch (mode) {
            case "annual":
                System.out.println("You will make 1 payment per year.");
                break;
            case "semi-nnual", "semiannual":
                System.out.println("You will make 2 payments per year. Payments will be due every 6 months.");
                break;
            case "quarterly":
                System.out.println("You will make 4 payments per year. Payments will be due every 3 months.");
                break;
            case "monthly":
                System.out.println("You will make 12 payments per year. Payments will be due every month.");
                break;
            default:
                System.out.println("Invalid payment mode selected. Please enter [Annual, Semi-Annual]");
                break;
        }

        scanner.close();
    }
}
