import java.util.Scanner;

public class CriticalCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Life Insurance Corporation of India");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter Critical Illness condition from the following list");
        System.out.println("Heart Disease");
        System.out.println("Cancer");
        System.out.println("Kidney Failure");
        System.out.println("---------------------------------------------------------");
        System.out.print("Enter Condition :-> ");

        String illness = scanner.nextLine().toLowerCase();

        switch (illness) {
            case "heart disease":
                System.out.println("Coverage Plan for Heart Disease");
                System.out.println("Amount : 15 Lakhs");
                System.out.println("Terms : 15 years");
                System.out.println("Benefits : free annual check-ups");
                break;
            
            case "cancer":
                System.out.println("Coverage Plan for Cancer");
                System.out.println("Amount : 20 Lakhs");
                System.out.println("Terms : 10 years");
                System.out.println("Benefits : free cancer screenings");
                break;
            
            case "kidney failure":
                System.out.println("Coverage Plan for Kidney Failure");
                System.out.println("Amount : 12 Lakhs");
                System.out.println("Terms : 20 years");
                System.out.println("Benefits : Dialysis");

            default:
                System.out.println("The Entered condition is not eligible for any coverage options");
                break;
        }
        scanner.close();
    }
}
