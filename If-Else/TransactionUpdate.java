import java.util.Scanner;

public class TransactionUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current amount :-> ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Transaction Type [Deposit / Withdrawl] :-> ");
        String type = scanner.nextLine();
      

        System.out.print("Enter Transaction Amount :-> ");
        double transactionAmount = scanner.nextDouble();

        if (type.equalsIgnoreCase("deposit")) {
            balance += transactionAmount;
        } else if (type.equalsIgnoreCase("withdrawl")) {
            if (transactionAmount > balance) {
                System.out.println("Insuffients funds,withdrawal amount exceeds the current balance");
            } else {
                balance -= transactionAmount;
            }
        } else {
            System.out.println("Invalid transaction type, Please Try again");
        }
        System.out.printf("Updated account balance : %.2f", balance);
        scanner.close();
    }
}
