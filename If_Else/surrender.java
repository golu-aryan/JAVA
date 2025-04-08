import java.util.Scanner;

public class surrender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter nunber of years the policy has been active : ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Policy type");
        System.out.println("1>  Endowment");
        System.out.println("2>  Term");
        System.out.println("3>  Money Back");
        System.out.print("Enter your Policy :-> ");
        String type = scanner.nextLine().toLowerCase();

        if (year < 0) {
            System.out.println("Invalid input. Policy year cannot be negative.");
        } else {
            switch (type) {
                case "endowment":
                    if (year >= 3 && year <= 5) {
                        System.out.println("The surrender value is 30% of the total premium paid");
                    } else if (year > 5) {
                        System.out.println("The surrender value is 50% of the total premium paid");
                    } else {
                        System.out.println("There is no surrender Value");
                    }
                    break;
                case "term":
                    System.out.println("there is no surrender value as it doesn’t have a surrender value");
                    break;

                case "money back":
                    if (year >= 3 && year <= 5) {
                        System.out.println("The surrender value is 30% of the total premium paid");
                    } else if (year > 5) {
                        System.out.println("The surrender value is 50% of the total premium paid");
                    } else {
                        System.out.println("There is no surrender Value");
                    }
                    break;

                default:
                    System.out.println("Invalid Type");
                    break;
            }
        }
        scanner.close();
    }
}