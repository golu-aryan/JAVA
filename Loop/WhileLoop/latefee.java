import java.util.Scanner;

public class latefee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        System.out.print("Do you want to calculate late fee? [y/n] :-> ");
        String userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter number of days :-> ");
            days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Error : Please enter a valid number of overdue days");
                continue;
            }

            int latefee = 0;
            if (days > 30) {
                System.out.println("The book is considered lost. You must pay a book replacement fee of 500");
            } else {
                if (days <= 7) {
                    latefee = days * 2;
                } else if (days <= 14) {
                    latefee = (7 * 2) + ((days - 7) * 5);
                } else {
                    latefee = (7 * 2) + (7 * 5) + ((days - 14) * 10);
                }
                System.out.println("The total late fee is : " + latefee);
            }
            scanner.nextLine();
            System.out.print("Do you want to calculate late fee for another student? [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Exit...");
                break;
            }
        }
        scanner.close();
    }
}
