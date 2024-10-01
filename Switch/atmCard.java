import java.util.Scanner;

public class atmCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("select appropriate type of ATM card based on your account Type.");
        System.out.println("1.  Saving");
        System.out.println("2.  Current");
        System.out.println("3.  Salary");
        System.out.print("Enter your type :-> ");
        String accountType = scanner.nextLine().toLowerCase();

        switch (accountType) {
            case "saving":
                System.out.println("For Saving Account, You will recieve a Debit Card");
                break;
            case "current":
                System.out.println("For current Account, You will recieve a Debit Card");
                break;
            case "salary":
                System.out.println("For Salary Account, You will recieve a Prepaid Card");
                break;
            default:
                System.out.println("Invalid Account Type.Please");
                break;
        }
        scanner.close();
    }
}
