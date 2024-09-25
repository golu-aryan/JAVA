import java.util.Scanner;

public class profession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Profession ");
        System.out.println("1>  Salaried");
        System.out.println("2>  Self-Employed");
        System.out.println("3>  Business");
        System.out.print("Your choice :-> ");
        int profession = scanner.nextInt();

        switch (profession) {
            case 1:
                System.out.println("Recommend : Endowment Plan");
                System.out.println("    >It provides a combination of saving and protection, which is suitable for steady income earners.");
                break;
            case 2:
                System.out.println("Recommend : Term Insurance");
                System.out.println("    >It provides higher coverage at lower premiums, which is ideal for people with variable income.");
                break;
            case 3:
                System.out.println("Recommend : Whole Life Insurance");
                System.out.println("    >It offers lifelong coverage and wealth transfer benefits, aligning with long-term financial planning.");
                break;
        
            default:
                System.out.println("Wrong Input! Please Try Again.");
                break;
        }

        scanner.close();
    }
}
