import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter number :-> ");
        number = scanner.nextInt();

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(number + " not Prime");
                break;
            } else {
                System.out.println(number + " is Prime");
                break;
            }
        }
        scanner.close();
    }
}
