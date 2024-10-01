import java.util.Scanner;

public class accountType {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Type [Saving, Current, Salary] :-> ");
        String accType = scanner.nextLine();

        switch (accType.toLowerCase()) {
            case "saving":
                System.out.println("Features of Saving Account : ");
                System.out.println("1.  Typically offers interest on deposits.");
                System.out.println("2.  Suitable for personal savings.");
                System.out.println("3.  May have withdrawl limits.");
                System.out.println("4.  Provides ATM/Debit card access.");
                break;

            case "current":
                System.out.println("Features of Current Account : ");
                System.out.println("1. No interest on deposits.");
                System.out.println("2.  Designed for frequent transactions.");
                System.out.println("3.  Unlimited withdrawals and deposits.");
                System.out.println("4.  Often used by business.");
                break;

            case "salary":
                System.out.println("Features of Saving Account : ");
                System.out.println("1.  Designed for salaried individuals.");
                System.out.println("2.  Typically has no minimum balance requirement.");
                System.out.println("3.  May offer additional benefits like loans at preferential rates.");
                System.out.println("4.  Allows automatic salary credit");
                break;
        
            default:
                System.out.println("Enter a valid option");
                break;
        }

        scanner.close();
    }
}
