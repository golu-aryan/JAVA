import java.util.Scanner;

public class nomineeinsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Relationship to PolicyHolder [Spouse, Child, Parent, Sibling, Friend]:-> ");
        String relation = scanner.nextLine().toLowerCase();

        System.out.print("Enter Nominee Age :-> ");
        int age = scanner.nextInt();


        switch (relation) {
            case "spouse", "child":
                System.out.println("Always valid");
                break;
            case "parent", "sibling":
                if (age >= 18) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Not Valid");
                }
                break;
            case "friend":
                if (age >= 18 && age <= 60) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Not Valid");
                }
                break;
            default:
                System.out.println("Invalid relationship entered. Please enter a valid relationship (Spouse, Child, Parent, Sibling, Friend).");
                break;
        }
        scanner.close();
    }
}
