import java.util.Scanner;

public class maturityamount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Maturity Amount of Life Insurance Policy");
        System.out.print("Enter Policy Amount [The initial amount invested] :-> ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Term [The Duration of the policy in years] :-> ");
        int years = scanner.nextInt();

        if (years < 5 || years > 30) {
            System.out.println("Invalid Term! Please enter term between 5 to 30 years");
        } else {
            double rate = 5;

            double maturityamount = principal + (principal * rate * years) / 100;
            System.out.println("Maturity Amount : " + maturityamount);
        }
        scanner.close();
    }
}
