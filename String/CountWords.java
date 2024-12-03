import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        if (string.isEmpty()) {
            System.out.println("String Cannot be empty. Please Enter Atleast One Word");
        } else {
            int wordCount = 1;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ' && string.charAt(i - 1) != ' ') {
                    wordCount++;
                }
            }
            System.out.println("Total Number of Words :-> " + wordCount);
        }

        scanner.close();
    }
}