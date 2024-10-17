import java.util.Scanner;

public class scholarshipcriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float gpa = 0;
        int annualincome = 0;

        System.out.print("Do you want to check scholarship criteria [y/n] :-> ");
        String userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {

            System.out.print("Enter student's GPA [0.0 - 10.0] :-> ");
            gpa = scanner.nextFloat();

            if (gpa < 0 || gpa > 10) {
                System.out.println("Invalid GPA. Please enter GPA between 0 and 10");
                continue;
            } 
                        
            System.out.print("Enter Family's annual income :-> ");
            if (scanner.hasNextInt()) {
                scanner.nextInt();
            }

            if (annualincome < 0) {
                System.out.println("Invalid Income. Please enter a positive integer");
                continue;
            } else {
                break;
            }
        }

        if (gpa >= 8.0 && annualincome < 800000) {
            System.out.println("Congratulations! You qualify for the scholarship");
        } else if (gpa < 8.0 && annualincome >= 800000) {
            System.out
                    .println("Unfortunately, you do not qualify for the scholarship due to both GPA and Family income");
        } else if (gpa < 8.0) {
            System.out.println("Unfortunately, You do not qualify for the scholarship due to insufficient GPA");
        } else {
            System.out.println("Unfortunately, You do not qualify for the scholarship due to high family income");
        }

        scanner.close();
    }
}