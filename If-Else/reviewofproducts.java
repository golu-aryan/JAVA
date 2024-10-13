import java.util.Scanner;

public class reviewofproducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your review :-> ");
        String reviewText = scanner.nextLine();

        if (reviewText.equals(" ")) {
            System.out.println("Error : Reviews text cannot be empty");
        } else {
            System.out.print("Enter your rating [1 to 5] :-> ");
            int rating = scanner.nextInt();

            if (rating < 1 || rating > 5) {
                System.out.println("Error : Rating must be a whole number between 1 and 5");
            } else {
                System.out.println("Your review has been submitted successfully!");
                System.out.println("Review : " + reviewText);
                System.out.println("Rating : " + rating + " stars");
            }
        }
        scanner.close();
    }
}
