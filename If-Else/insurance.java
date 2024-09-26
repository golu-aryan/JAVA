import java.util.Scanner;

public class insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age :-> ");
        int age = scanner.nextInt();

        System.out.print("Enter term in years :-> ");
        int term = scanner.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Sry! Invalid Age. Enter valid age.");
        } else {
            if (age >= 18 && age <= 30) {
                if (term == 10 || term == 15 || term == 20) {
                    System.out.println("You're eligible for term length");
                } else {
                    System.out.println("You're not eligible for term length");
                }
            } else if (age >= 31 && age <= 45) {
                if (term == 10 || term == 15 || term == 20 || term == 25) {
                    System.out.println("You're eligible for term length");
                } else {
                    System.out.println("You're not eligible for term length");
                }
            } else if (age >= 46 && age <= 60) {
                if (term == 5 || term == 10 || term == 15) {
                    System.out.println("You're eligible for term length");
                } else {
                    System.out.println("You're not eligible for term length");
                } 
            } else if (age > 60) {
                if (term == 5) {
                    System.out.println("You're eligible for term length");
                } else {
                    System.out.println("You're not eligible for term length");
                }
            }
        }
        scanner.close();
    }
}
