import java.util.Scanner;

public class Department {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your option [1-3] :-> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Welcome to Saving Account Department");
                break;
            case 2:
                System.out.println("Welcome to Current Account Department");
                break;
            case 3:
                System.out.println("Welcome to Cards Department");
                break;
            default:
                System.out.println("Sry! Invalid Option");
                break;
        }
        scanner.close();
    }
}
