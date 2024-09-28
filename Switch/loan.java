import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary :-> ");
        int salary = scanner.nextInt();

        System.out.println("Types of Loan");
        System.out.println("1.  Home");
        System.out.println("2.  Personal");
        System.out.println("3.  Car");
        System.out.print("Enter Loan :-> ");
        int loan = scanner.nextInt();

        switch (loan) {
            case 1:
                if (salary >= 30000) {
                    System.out.println("You're eligible for Home Loan");
                } else {
                    System.out.println("you're not eligible for Home Loan");
                }
                break;
            case 2:
                if (salary >= 25000) {
                    System.out.println("You're eligible for Personal Loan");
                } else {
                    System.out.println("You're not eligible for Perosnal Loan");
                }
                break;
            case 3:
                if (salary >= 20000) {
                    System.out.println("You're eligible for Car Loan");
                } else {
                    System.out.println("You're not eligible for Car Loan");
                }
                break;
            default:
                System.out.println("Invalid type");
                break;
        }
        scanner.close();
    }
}
